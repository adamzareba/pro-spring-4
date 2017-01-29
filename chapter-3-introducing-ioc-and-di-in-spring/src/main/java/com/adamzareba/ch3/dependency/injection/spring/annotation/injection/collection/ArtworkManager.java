package com.adamzareba.ch3.dependency.injection.spring.annotation.injection.collection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import lombok.Getter;

@Service("artworkManager")
public class ArtworkManager {

    @Resource(name = "senders")
    @Getter
    private List<ArtworkSender> artworkSenders;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        ArtworkManager instance = (ArtworkManager) ctx.getBean("artworkManager");
        for(ArtworkSender sender : instance.getArtworkSenders()) {
            System.out.println(sender.getShortName() + " === " + sender.getFriendlyName());
        }
    }
}
