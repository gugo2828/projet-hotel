package org.example;

import java.util.ArrayList;

public class Persone extends Client{


    public Persone(int id, String nom, String prenom, String adresse) {
        super(id, nom, prenom, adresse);
    }



    @Override
    public String toString() {
        return "Persone{" +
                "id=" + this.id +
                ", idReservation=" + this.idReservation +
                ", nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom + '\'' +
                ", adresse='" + this.adresse + '\'' +"\n"+
                '}';
    }
}
