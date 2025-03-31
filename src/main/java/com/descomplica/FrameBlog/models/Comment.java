package com.descomplica.FrameBlog.models;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;
    private String content;
    private Date date;
    @ManyToOne
    private UserV2 userV2;
    @ManyToOne
    private Post post;

    public Comment() {
    }

    public Comment(final Long commentId, final String content, final Date date, final UserV2 userV2, final  Post post) {
        this.commentId = commentId;
        this.content = content;
        this.date = date;
        this.userV2 = userV2;
        this.post = post;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserV2 getUser() {
        return userV2;
    }

    public void setUser(UserV2 userV2) {
        this.userV2 = userV2;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
