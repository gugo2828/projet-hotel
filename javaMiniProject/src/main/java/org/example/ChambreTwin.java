package org.example;

public class ChambreTwin extends Chambre{


    public ChambreTwin(int id, int num, boolean etat) {
        super(id, num, etat);
    }

    @Override
    public String toString() {
        return "ChambreTwin{" +
                "id=" + this.id +
                ", idreservation=" + this.idreservation +
                ", num=" + this.num +
                ", etat=" + this.etat +"\n"+
                '}';
    }
}
