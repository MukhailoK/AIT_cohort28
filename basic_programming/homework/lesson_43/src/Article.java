public class Article {
    private String name;
    private String text;
    private String nameAuthor;
    private State state;

    public Article(String name, String text, String nameAuthor) {
        this.name = name;
        this.text = text;
        this.nameAuthor = nameAuthor;
        this.state = State.DRAFT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public void sendToReview() {
        if (state == State.DRAFT || state == State.ON_EDIT) {
            state = State.ON_REVIEW;
        } else {
            throw new IllegalStateException("from this state review is not possible " + state);
        }
    }

    public void publish() {
        if (state == State.ON_REVIEW) {
            state = State.PUBLISHED;
        } else {
            throw new IllegalStateException("from this state publishing is not possible " + state);
        }
    }

    public void decline() {
        if (state == State.ON_REVIEW) {
            state = State.DECLINED;
        } else {
            throw new IllegalStateException("from this state declining is not possible " + state);
        }
    }

    public void delete() {
        if (state == State.DECLINED || state == State.ON_EDIT) {
            state = State.DELETED;
        } else {
            throw new IllegalStateException("from this state deleting is not possible " + state);
        }
    }

    public void edit() {
        if (state == State.DECLINED) {
            state = State.ON_EDIT;
        } else {
            throw new IllegalStateException("from this state editing is not possible " + state);
        }
    }

    enum State {
        DRAFT, ON_REVIEW, PUBLISHED, DECLINED, DELETED, ON_EDIT
    }
}
