package dev.ejassab.suivi_candidature.controller;

import dev.ejassab.suivi_candidature.model.Candidature;
import dev.ejassab.suivi_candidature.repository.CandidatureCollectionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidature")
public class CandidatureController {

    private final CandidatureCollectionRepository repository;
    private final PathMatcher pathMatcher;

    public CandidatureController(CandidatureCollectionRepository repository, PathMatcher pathMatcher) {
        this.repository = repository;
        this.pathMatcher = pathMatcher;
    }

    // je veux créer quelque chose qui permet à un client de d'envoyer une requête lui permettant d'avoir accès à toutes les instances de candidatures dans le système
    @GetMapping("")
    public List<Candidature> findAll() {
    return repository.findAll();
    }

    @GetMapping("/{id}")
    public Candidature findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Candidature inexistante!"));
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Candidature candidature) {
        repository.save(candidature);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Candidature candidature, @PathVariable Integer id) {
        if (! repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Candidature inexistante!");
        }
        repository.save(candidature);
        }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}


