package org.example;

public class Chambre {
    int id = 0;
    int idreservation = 0;

    int num = 0;
    //si la chambre est false,il est vide
    boolean etat = false;

    public Chambre(int id, int num, boolean etat) {
        this.id = id;
        this.num = num;
        this.etat = etat;
    }


    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getIdreservation() {
        return this.idreservation;
    }


    public void setIdreservation(int idreservation) {

        this.idreservation = idreservation;
    }


    public int getNum() {
        return this.num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public boolean isEtat() {
        return this.etat;
    }


    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + this.id +
                ", idreservation=" + this.idreservation +
                ", num=" + this.num +
                ", etat=" + this.etat + "\n" +
                '}';
    }
}
