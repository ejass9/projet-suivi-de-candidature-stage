package com.projet.candidapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="entreprises")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomEntreprise;

}
