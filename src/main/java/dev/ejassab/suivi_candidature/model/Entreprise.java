package dev.ejassab.suivi_candidature.model;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "entreprises")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public  class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nonnull
    private String nom;

    private Contact contact;
    private  String mailContact;

    private String ville;

    private String adresse;
}
