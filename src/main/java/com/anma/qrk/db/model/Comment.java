package com.anma.qrk.db.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

@Table(name = "comments")
public class Comment {

    @Id
    public long id;
    public String body;
    public String category;
    @Column(name = "created_at")
    public LocalDateTime createdAt;
    @Column(name = "author_id")
    public long authorId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
}
