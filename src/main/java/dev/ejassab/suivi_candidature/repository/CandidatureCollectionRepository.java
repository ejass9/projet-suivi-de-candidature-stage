package dev.ejassab.suivi_candidature.repository;
import dev.ejassab.suivi_candidature.model.Candidature;
import dev.ejassab.suivi_candidature.model.Status;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
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

    @PostConstruct
    private void init() {
        Candidature c = new Candidature(1, "Total Energies", "contact@totalenergie.net", Status.A_ENVOYER, LocalDateTime.now(), null, "");
        candidatures.add(c);
    }

    public void save(Candidature candidature) {
        candidatures.removeIf(c -> c.id().equals(candidature.id()));
        candidatures.add(candidature);
    }

    public Boolean existsById(Integer id) {
        return candidatures.stream().anyMatch(candidature -> candidature.id().equals(id));
    }

    public void delete(Integer id) {
        candidatures.removeIf(c -> c.id().equals(id));
    }
}
