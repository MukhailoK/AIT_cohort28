package forum.dao;

import forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ForumImpl implements Forum {

    private static final int DEFAULT_SIZE = 10;

    static Comparator<Post> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getPostId(), p2.getPostId());
    };

    private Post[] posts;
    private int size;

    public ForumImpl() {
        posts = new Post[DEFAULT_SIZE];
    }

    private boolean save(Post post) {
        if (post != null) {
            int index = Arrays.binarySearch(posts, 0, size, post, comparator);
            index = index >= 0 ? index : -index - 1;
            System.arraycopy(posts, index, posts, index + 1, size - index);
            posts[index] = post;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean addPost(Post post) {
        if (posts.length > size && !isPresent(post)) {
            return save(post);

        } else if (size == posts.length && !isPresent(post)) {
            Post[] posts = new Post[size + size / 2];
            System.arraycopy(this.posts, 0, posts, 0, this.posts.length);
            this.posts = posts;
            return save(post);
        }
        return false;
    }

    private boolean isPresent(Post post) {
        if (post != null) {
            for (Post p : posts) {
                if (post.equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                System.arraycopy(posts, i + 1, posts, i, size - 1 - i);
                posts[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        Post post = getPostById(postId);
        if (post == null) {
            return false;
        }
        post.setContent(content);
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        Post post = new Post(postId, null, null, null);
        for (Post p : posts) {
            if (post.equals(p)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return findByPredicate(post -> post.getAuthor().equals(author));
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        Post[] posts = getPostsByAuthor(author);
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(posts, 0, posts.length, pattern, comparator) - 1;
        from = from >= 0 ? from : -from - 1;
        pattern = new Post(Integer.MAX_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(posts, 0, posts.length, pattern, comparator) - 1;
        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override
    public int size() {
        return size;
    }

    private Post[] findByPredicate(Predicate<Post> predicate) {
        Post[] res = new Post[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(posts[i])) {
                res[j++] = posts[i];
            }
        }
        return Arrays.copyOf(res, j);
    }
}
