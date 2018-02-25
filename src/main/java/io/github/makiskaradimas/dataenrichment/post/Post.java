package io.github.makiskaradimas.dataenrichment.post;

import com.mongodb.BasicDBObject;

/**
 * @author Makis Karadimas
 */
public class Post {

    private String id;
    private String title;
    private String text;
    private String status;
    private String author;
    private String category;

    // Fields used for deserialization
    public BasicDBObject schema;
    public BasicDBObject payload;

    public Post() {
    }

    public Post update(Post patch) {
        if (patch.id != null) {
            this.id = patch.id;
        }
        if (patch.title != null) {
            this.title = patch.title;
        }
        if (patch.text != null) {
            this.text = patch.text;
        }
        if (patch.status != null) {
            this.status = patch.status;
        }
        if (patch.author != null) {
            this.author = patch.author;
        }
        if (patch.category != null) {
            this.category = patch.category;
        }
        return this;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public BasicDBObject getSchema() {
        return schema;
    }

    public void setSchema(BasicDBObject schema) {
        this.schema = schema;
    }

    public BasicDBObject getPayload() {
        return payload;
    }

    public void setPayload(BasicDBObject payload) {
        this.payload = payload;
    }
}
