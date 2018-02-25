package io.github.makiskaradimas.dataenrichment;

/**
 * @author Makis Karadimas
 */
public interface URIProvider {
    String getHost();

    int getPort();

    String getPath();
}
