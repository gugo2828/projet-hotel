package org.example;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Reservation {

    private static int compteur=1;
    int id;
    public Date datestart;
    public Date dateend;

    public Reservation() {


    }

    public void addCambreToReservation(Chambre chambre, Client client, Date datestart, Date dateend) {
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


    public Date getDatestart() {
        return this.datestart;
    }


    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return this.dateend;
    }


    public void setDateend(Date dateend) {
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
