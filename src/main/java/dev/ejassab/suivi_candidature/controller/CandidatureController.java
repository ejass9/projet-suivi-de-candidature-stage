package dev.ejassab.suivi_candidature.controller;

import dev.ejassab.suivi_candidature.model.Candidature;
import dev.ejassab.suivi_candidature.repository.CandidatureCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/candidature")
public class CandidatureController {

    private final CandidatureCollectionRepository repository;

    public CandidatureController(CandidatureCollectionRepository repository) {
        this.repository = repository;
    }

    // je veux créer quelque chose qui permet à un client de d'envoyer une requête lui permettant d'avoir accès à toutes les instances de candidatures dans le système
        @GetMapping("")
        public List<Candidature> findAll() {
        return repository.findAll();
    }
}