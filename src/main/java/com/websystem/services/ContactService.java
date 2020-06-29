package com.websystem.services;

import com.websystem.entity.Contact;
import com.websystem.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContactService {


    @Autowired
    ContactRepository contactRepository;

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    public Contact validateContact(Contact contact) {
        return contactRepository.findById(contact.getIdContact().longValue()).get();
    }
}
