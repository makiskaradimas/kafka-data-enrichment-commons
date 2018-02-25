package io.github.makiskaradimas.dataenrichment.subscription;

import io.github.makiskaradimas.dataenrichment.URIProvider;

/**
 * @author Makis Karadimas
 */
public class SubscriberValue implements URIProvider {

    private String host;
    private int port;
    private String path;
    private int partition;

    public SubscriberValue() {
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
