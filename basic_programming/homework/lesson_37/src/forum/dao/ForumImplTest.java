package forum.dao;

import forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {

    Forum forum;
    LocalDateTime now = LocalDateTime.now();
    Post[] posts = new Post[6];

    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts[0] = new Post(1, "Title1", "Author1", "Content1");
        posts[1] = new Post(2, "Title2", "Author2", "Content2");
        posts[1].setDate(now.minusDays(4));
        posts[2] = new Post(3, "Title3", "Author2", "Content3");
        posts[2].setDate(now.minusDays(3));
        posts[3] = new Post(4, "Title4", "Author4", "Content4");
        posts[4] = new Post(5, "Title5", "Author1", "Content5");
        posts[5] = new Post(6, "Title6", "Author1", "Content6");
        for (Post post : posts) {
            forum.addPost(post);
        }

    }

    @Test
    void addPost() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            forum.addPost(null);
        });
        String expectedMessage = "Post can't be null";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
        assertFalse(forum.addPost(posts[1]));
        Post post = new Post(7, "Title7", "Author3", "Content7");
        assertTrue(forum.addPost(post));
        assertEquals(7, forum.size());
    }


    @Test
    void removePost() {
        assertFalse(forum.removePost(10));
        assertTrue(forum.removePost(1));
        assertEquals(5, forum.size());
        assertNull(forum.getPostById(1));
    }

    @Test
    void updatePost() {
        assertTrue(forum.updatePost(1, "New content"));
        assertEquals("New content", forum.getPostById(1).getContent());
    }

    @Test
    void getPostById() {
        assertEquals(posts[0], forum.getPostById(1));
        assertNull(forum.getPostById(10));
    }

    @Test
    void getPostsByAuthor() {
        Post[] expected = new Post[2];
        expected[1] = posts[2];
        expected[0] = posts[1];
        Post[] actual = forum.getPostsByAuthor("Author2");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetPostsByAuthorAndDates() {
        LocalDate ld = now.toLocalDate();
        Post[] actual = forum.getPostsByAuthor("Author2", ld.minusDays(5), ld.minusDays(2));
        Post[] expected = new Post[2];
        expected[1] = posts[2];
        expected[0] = posts[1];
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, forum.size());
    }

    @Test
    void testLikes() {
        forum.getPostById(1).addLikes();
        assertEquals(1, forum.getPostById(1).getLikes());
    }
}