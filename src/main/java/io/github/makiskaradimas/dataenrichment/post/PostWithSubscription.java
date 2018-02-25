package io.github.makiskaradimas.dataenrichment.post;

import io.github.makiskaradimas.dataenrichment.subscription.SubscriptionStatus;
import io.github.makiskaradimas.dataenrichment.subscription.SubscriptionValue;

/**
 * @author Makis Karadimas
 */
public class PostWithSubscription {

    private String subscriptionId;
    private SubscriptionStatus subscriptionStatus;
    private String subscriberId;
    private String id;
    private String title;
    private String text;
    private String author;
    private String category;
    private String status;

    public PostWithSubscription() {
    }

    public PostWithSubscription(PostWithSubscription other) {
        this.subscriptionId = other.subscriptionId;
        this.subscriptionStatus = other.subscriptionStatus;
        this.subscriberId = other.subscriberId;
        this.id = other.id;
        this.title = other.title;
        this.text = other.text;
        this.author = other.author;
        this.category = other.category;
        this.status = other.status;
    }

    public PostWithSubscription(Post post, SubscriptionValue subscriptionValue) {
        this.subscriptionId = subscriptionValue.getSubscriptionId();
        this.subscriptionStatus = subscriptionValue.getStatus();
        this.subscriberId = subscriptionValue.getSubscriberId();
        this.id = post.getId();
        this.title = post.getTitle();
        this.text = post.getText();
        this.author = post.getAuthor();
        this.category = post.getCategory();
        this.status = post.getStatus();
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public SubscriptionStatus getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
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
