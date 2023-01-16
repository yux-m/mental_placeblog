package cit59x.hackathon.mental_placeblog.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "blog_post", schema = "mental_placeblog", catalog = "")
public class BlogPost {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "userID")
    private int userId;
    @Basic
    @Column(name = "feeling_rating")
    private int feelingRating;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "score")
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFeelingRating() {
        return feelingRating;
    }

    public void setFeelingRating(int feelingRating) {
        this.feelingRating = feelingRating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return id == blogPost.id && userId == blogPost.userId && Objects.equals(feelingRating, blogPost.feelingRating) && Objects.equals(content, blogPost.content) && Objects.equals(score, blogPost.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, feelingRating, content, score);
    }
}
