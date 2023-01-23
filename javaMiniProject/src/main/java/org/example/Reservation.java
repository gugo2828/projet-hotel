package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Reservation {

    private static int compteur=1;
    int id;
    public LocalDate datestart;
    public LocalDate dateend;

    public Reservation() {


    }

    public void addCambreToReservation(Chambre chambre, Client client, LocalDate datestart, LocalDate dateend) {
        this.id=compteur;
        chambre.setEtat(true);
        chambre.setIdreservation(compteur);
        this.datestart = datestart;
        this.dateend = dateend;
        client.setIdReservation(this.id);
        compteur+=1;
    }

    public void removeCambreFromReservation(Chambre chambre, Client client) {
        chambre.setEtat(false);
        chambre.setIdreservation(0);
        client.setIdReservation(0);

    }

    public int getId() {
        return this.id;
    }


    public LocalDate getDatestart() {
        return this.datestart;
    }


    public void setDatestart(LocalDate datestart) {
        this.datestart = datestart;
    }

    public LocalDate getDateend() {
        return this.dateend;
    }


    public void setDateend(LocalDate dateend) {
        this.dateend = dateend;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + this.id +
                ", datestart=" + datestart +
                ", dateend=" + dateend + "\n" +
                '}';
    }
}
