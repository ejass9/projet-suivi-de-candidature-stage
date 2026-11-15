package com.projet.candidapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="candidatures")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
