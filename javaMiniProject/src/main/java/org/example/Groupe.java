package org.example;

public class Groupe extends Client {
    public Groupe(int id, String nom, String prenom, String adresse) {
        super(id, nom, prenom, adresse);
    }

    @Override
    public String toString() {
        return "Groupe{" +
                "id=" + this.id +
                ", idReservation=" + this.idReservation +
                ", nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom + '\'' +
                ", adresse='" + this.adresse + '\'' + "\n" +
                '}';
    }
}
