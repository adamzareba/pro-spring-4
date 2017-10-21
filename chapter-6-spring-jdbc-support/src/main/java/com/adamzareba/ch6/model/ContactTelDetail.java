package com.adamzareba.ch6.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactTelDetail implements Serializable {

    private Long id;
    private Long contactId;
    private String telType;
    private String telNumber;
}

