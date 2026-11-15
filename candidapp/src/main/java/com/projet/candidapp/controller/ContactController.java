package com.projet.candidapp.controller;

import com.projet.candidapp.model.Contact;
import com.projet.candidapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public Iterable<Contact> getContacts() {
        return contactService.getContacts();
    }
}
