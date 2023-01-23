package org.example;

public class Societe extends Client{
    public Societe(int id, String nom, String prenom, String adresse) {
        super(id, nom, prenom, adresse);
    }

    @Override
    public String toString() {
        return "Societe{" +
                "id=" + this.id +
                ", idReservation=" + this.idReservation +
                ", nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom + '\'' +
                ", adresse='" + this.adresse + '\'' +"\n"+
                '}';
    }
}
