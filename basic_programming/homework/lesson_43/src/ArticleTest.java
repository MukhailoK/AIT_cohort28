import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArticleTest {
    private Article article;

    @BeforeEach
    void setUp() {
        article = new Article(
                "Name",
                "Text",
                "Name author");
    }

    @Test
    public void getState() {
        assertEquals(Article.State.DRAFT, article.getState());
    }

    @Test
    public void sendToReview() {
        article.sendToReview();
        assertEquals(Article.State.ON_REVIEW, article.getState());
        assertThrows(IllegalStateException.class, () -> article.sendToReview());
        article.setState(Article.State.ON_EDIT);
        article.sendToReview();
        assertEquals(Article.State.ON_REVIEW, article.getState());
    }

    @Test
    public void publish() {
        assertThrows(IllegalStateException.class, () -> article.publish());
        article.setState(Article.State.ON_REVIEW);
        article.publish();
        assertEquals(Article.State.PUBLISHED, article.getState());
    }

    @Test
    public void decline() {
        assertThrows(IllegalStateException.class, () -> article.decline());
        article.setState(Article.State.ON_REVIEW);
        article.decline();
        assertEquals(Article.State.DECLINED, article.getState());
    }

    @Test
    public void delete() {
        assertThrows(IllegalStateException.class, () -> article.delete());
        article.setState(Article.State.DECLINED);
        article.delete();
        assertEquals(Article.State.DELETED, article.getState());
        article.setState(Article.State.ON_EDIT);
        article.delete();
        assertEquals(Article.State.DELETED, article.getState());
    }

    @Test
    public void edit() {
        assertThrows(IllegalStateException.class, () -> article.edit());
        article.setState(Article.State.DECLINED);
        article.edit();
        assertEquals(Article.State.ON_EDIT, article.getState());
    }
}