package com.adamzareba.ch4.bean.factory;

import java.security.MessageDigest;

public class MessageDigestFactory {

    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}