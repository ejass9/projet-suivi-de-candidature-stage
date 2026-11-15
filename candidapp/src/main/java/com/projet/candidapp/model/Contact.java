package com.projet.candidapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom_contact")
    private String nom;
    @Column(nullable = false, unique = true)
    private String mail;

}
