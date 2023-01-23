package org.example;

import java.util.ArrayList;

public class HotelDB {

    ArrayList<Client> allClients = new ArrayList<>();



    public void addPersonToHotel(Client client) {

        this.allClients.add(client);
        /*for (Chambre c : this.Allreservation) {
            if (!Objects.equals(c.getNum(), chambre.getNum())) {

            }
        }*/
    }
    @Override
    public String toString() {
        return "HotelDB{" +
                "allClients=" + this.allClients +"\n"+
                '}';
    }
}
