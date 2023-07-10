package forum.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post implements Comparable<Post> {

    private final int postId;
    private final String title;
    private final String author;
    private String content;
    private LocalDateTime date;
    private int likes;

    public Post(int postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        date = LocalDateTime.now();
        likes = 0;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int addLikes() {
        return likes++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public int compareTo(Post o) {
        int res = Integer.compare(postId, o.postId);
        return res;
    }
}
