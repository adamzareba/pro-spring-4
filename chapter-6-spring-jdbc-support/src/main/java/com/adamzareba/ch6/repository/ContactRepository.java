package com.adamzareba.ch6.repository;

import com.adamzareba.ch6.model.Contact;

import java.util.List;

public interface ContactRepository {

    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    String findLastNameById(Long id);

    String findFirstNameById(Long id);

    void insert(Contact contact);

    void update(Contact contact);

    void delete(Long contactId);
}
