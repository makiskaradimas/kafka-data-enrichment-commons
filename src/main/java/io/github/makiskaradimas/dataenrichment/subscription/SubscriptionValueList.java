package io.github.makiskaradimas.dataenrichment.subscription;

import java.util.List;

/**
 * @author Makis Karadimas
 */
public class SubscriptionValueList {

    private List<SubscriptionValue> subscriptionValues;

    public SubscriptionValueList() {
    }

    public List<SubscriptionValue> getSubscriptionValues() {
        return subscriptionValues;
    }

    public void setSubscriptionValues(List<SubscriptionValue> subscriptionValues) {
        this.subscriptionValues = subscriptionValues;
    }
}
