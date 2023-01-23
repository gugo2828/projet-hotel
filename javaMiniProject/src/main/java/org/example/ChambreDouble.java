package org.example;

public class ChambreDouble extends Chambre{

    public ChambreDouble(int id, int num, boolean etat) {
        super(id, num, etat);
    }

    @Override
    public String toString() {
        return "ChambreDouble{" +
                "id=" + this.id +
                ", idreservation=" + this.idreservation +
                ", num=" + this.num +
                ", etat=" + this.etat +"\n"+
                '}';
    }
}
