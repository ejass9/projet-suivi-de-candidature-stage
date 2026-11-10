package dev.ejassab.suivi_candidature.model;

public  class Entreprise {
    private Integer id;
    private String nom;
    private Contact contact;
    private String ville;
    private String adresse;

    public Entreprise(Integer id, String nom, String ville){
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }
    public Entreprise(Integer id, String nom, String ville, String adresse) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
