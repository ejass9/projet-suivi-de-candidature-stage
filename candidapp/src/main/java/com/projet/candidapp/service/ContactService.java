package com.projet.candidapp.service;

import com.projet.candidapp.model.Contact;
import com.projet.candidapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Iterable<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public Optional <Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(final long id) {
        contactRepository.deleteById(id);
    }


}
