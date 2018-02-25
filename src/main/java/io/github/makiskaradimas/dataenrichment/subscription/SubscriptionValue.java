package io.github.makiskaradimas.dataenrichment.subscription;

/**
 * @author Makis Karadimas
 */
public class SubscriptionValue {

    private String subscriptionId;
    private String category;
    private String subscriberId;
    private SubscriptionStatus status;

    public SubscriptionValue() {
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatus status) {
        this.status = status;
    }
}
