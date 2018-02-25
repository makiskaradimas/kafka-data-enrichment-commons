package io.github.makiskaradimas.dataenrichment.gson;

import io.github.makiskaradimas.dataenrichment.post.EnrichedPost;

/**
 * @author Makis Karadimas
 */
public class PostDto {

    private String id;
    private String title;
    private String text;
    private String author;
    private String category;
    private String status;

    public PostDto() {
    }

    public PostDto(EnrichedPost enrichedPost) {
        this.id = enrichedPost.getId() + enrichedPost.getSubscriptionId();
        this.title = enrichedPost.getTitle();
        this.text = enrichedPost.getText();
        this.author = enrichedPost.getAuthor();
        this.category = enrichedPost.getCategory();
        this.status = enrichedPost.getStatus();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
