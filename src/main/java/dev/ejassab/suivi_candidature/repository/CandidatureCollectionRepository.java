package dev.ejassab.suivi_candidature.repository;
import dev.ejassab.suivi_candidature.model.Candidature;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class CandidatureCollectionRepository {

    private final List<Candidature> candidatures = new ArrayList<>();
    public CandidatureCollectionRepository() {}

    public List<Candidature> findAll() {
        return candidatures;
    }

    public Optional<Candidature> findById(Integer id) {
        return candidatures.stream().filter(candidature -> candidature.id().equals(id)).findFirst();
    }
}
