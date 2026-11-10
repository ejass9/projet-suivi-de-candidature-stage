package dev.ejassab.suivi_candidature.model;

import java.time.LocalDateTime;

public record Candidature (
    Integer id,
    String LibelleEntreprise,
    String contactEntreprise,
    Status status,
    LocalDateTime dateDeCreation,
    LocalDateTime dateDeRelance,
    String url)

{


}
