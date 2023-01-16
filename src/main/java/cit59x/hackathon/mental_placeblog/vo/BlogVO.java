package cit59x.hackathon.mental_placeblog.vo;

/**
 * Value object for create and view blog post(s).
 */
public class BlogVO {

    private int userId;
    private int feelingRating;
    private String content;

    public int getUserId() {
        return userId;
    }

    public int getFeelingRating() {
        return feelingRating;
    }

    public String getContent() {
        return content;
    }
}
