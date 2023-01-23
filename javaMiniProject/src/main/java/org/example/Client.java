package org.example;

public class Client {
    int id;
    int idReservation;
    String nom;
    String prenom;
    String adresse;

    public Client(int id, String nom, String prenom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }


    public int getIdReservation() {
        return this.idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getAdresse() {
        return this.adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
