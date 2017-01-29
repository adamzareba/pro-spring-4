package com.adamzareba.ch3.dependency.injection.spring.annotation.injection.collection;

public interface ArtworkSender {

    void sendArtwork(String artworkPath, Recipient recipient);

    String getFriendlyName();

    String getShortName();
}
