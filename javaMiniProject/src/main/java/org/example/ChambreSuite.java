package org.example;

public class ChambreSuite extends Chambre {

    public ChambreSuite(int id, int num, boolean etat) {
        super(id, num, etat);
    }

    @Override
    public String toString() {
        return "ChambreSuite{" +
                "id=" + this.id +
                ", idreservation=" + this.idreservation +
                ", num=" + this.num +
                ", etat=" + this.etat + "\n" +
                '}';
    }
}
