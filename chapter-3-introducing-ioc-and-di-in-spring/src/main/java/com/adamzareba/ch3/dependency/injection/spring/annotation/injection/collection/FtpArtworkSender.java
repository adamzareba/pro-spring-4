package com.adamzareba.ch3.dependency.injection.spring.annotation.injection.collection;

public class FtpArtworkSender implements ArtworkSender {

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {

    }

    @Override
    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }
}
