package io.github.makiskaradimas.dataenrichment.post;

import io.github.makiskaradimas.dataenrichment.URIProvider;
import io.github.makiskaradimas.dataenrichment.subscription.SubscriberValue;

/**
 * @author Makis Karadimas
 */
public class EnrichedPost extends PostWithSubscription implements URIProvider {

    private String host;
    private int port;
    private String path;
    private int partition;

    public EnrichedPost() {
    }

    public EnrichedPost(PostWithSubscription postWithSubscription, SubscriberValue subscriberValue) {
        super(postWithSubscription);
        this.host = subscriberValue.getHost();
        this.port = subscriberValue.getPort();
        this.path = subscriberValue.getPath();
        this.partition = subscriberValue.getPartition();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPartition() {
        return partition;
    }

    public void setPartition(int partition) {
        this.partition = partition;
    }
}
