package org.example;

public class ChambreSingle extends Chambre {

    public ChambreSingle(int id, int num, boolean etat) {
        super(id, num, etat);
    }

    @Override
    public String toString() {
        return "ChambreSingle{" +
                "id=" + this.id +
                ", idreservation=" + this.idreservation +
                ", num=" + this.num +
                ", etat=" + this.etat + "\n" +
                '}';
    }
}
