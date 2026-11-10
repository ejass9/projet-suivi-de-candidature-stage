package dev.ejassab.suivi_candidature.model;

import java.time.LocalDateTime;

public record Candidature (
    Integer id,
    String desc,
    Status status,
    LocalDateTime dateDeCreation,
    LocalDateTime dateDeRelance,
    String url)

{


}
