package org.example;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.*;


/*
****** Mini projet Hôtel ******
Ce projet a pour but de prendre en main les concepts de la programmation orienté objet Java par le
développement d’un système de réservation pour un hôtel.
L’application doit permettre à un réceptionniste de prendre des réservations d’une ou plusieurs
chambres par un client, un groupe, ou encore une société. Par conséquent, une chambre n’est pas
obligatoirement réservée par une personne morale. Une chambre réservée possède un type
particulier, parmi lesquels :


  - single ou simple : chambre équipée d’un grand lit ou de deux lits séparés. Le terme "single"
    désigne le tarif pour une seule et unique personne occupant la chambre,
  - twin ou jumeaux : chambre équipée de deux lits séparés, pouvant donc accueillir deux
    personnes,
  - double : chambre équipée d’un grand lit, pouvant accueillir deux personnes.
  - suite : accommodation composée de plusieurs pièces (p. ex. chambre et salon), de meubles
    supplémentaires, . . .


Les fonctions à assurer sont :
    -Au lancement de notre programme, on crée une liste de chambres de plusieurs
     types, qui sont réservées (1) ou libres (0) en utilisant la fonction randInt.
    -Afficher l’état de l’hôtel
    -Afficher le nombre de chambres réservées
    -Afficher le nombre de chambres libres
    -Afficher le numéro de la première chambre vide de chaque type *******  a faire
    -Afficher le numéro de la dernière chambre vide de chaque type *******a faire
    -Réserver une chambre de type x
    -Libérer une chambre de type x
Pour cela, nous devons afficher le menu suivant à l’utilisateur de notre programme

:Règles métier
Le menu doit s’afficher en boucle tant que l’utilisateur n’a pas choisi l’option « Quitter ».
Les deux options « F et G » doivent être protégées par un login et mot de passe stockés dans
des variables.
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        ChambreSingle ch1 = new ChambreSingle(1,100,false);
        ChambreSingle ch2 = new ChambreSingle(2,101,false);
        ChambreSingle ch3 = new ChambreSingle(3,102,false);
        ChambreTwin ch4 = new ChambreTwin(4,200,false);
        ChambreTwin ch5 = new ChambreTwin(5,201,false);
        ChambreTwin ch6 = new ChambreTwin(6,202,false);
        ChambreDouble ch7 = new ChambreDouble(7,300,false);
        ChambreDouble ch8 = new ChambreDouble(8,301,false);
        ChambreDouble ch9 = new ChambreDouble(9,302,false);
        ChambreSuite ch10 = new ChambreSuite(10,400,false);
        ChambreSuite ch11 = new ChambreSuite(11,401,false);
        ChambreSuite ch12 = new ChambreSuite(12,402,false);

        ArrayList <Chambre> hotel =new ArrayList<>();
        hotel.add(ch1);
        hotel.add(ch2);
        hotel.add(ch3);
        hotel.add(ch4);
        hotel.add(ch5);
        hotel.add(ch6);
        hotel.add(ch6);
        hotel.add(ch7);
        hotel.add(ch8);
        hotel.add(ch9);
        hotel.add(ch10);
        hotel.add(ch11);
        hotel.add(ch12);



        //creation client
        Persone personne1 = new Persone(1,"Almar","David","32 rue des Arbres 59800");
        Groupe personne2 = new Groupe(2,"Antonio","Goutereche","1 Arbres 62000");
        Societe personne3 = new Societe(3,"Davide","Coperfild","5 rue des Karin 78000");



        ArrayList <Client> hoteldatabase =new ArrayList<>();
        //ajout client
        hoteldatabase.add(personne1);
        hoteldatabase.add(personne2);
        hoteldatabase.add(personne3);


        ArrayList <Reservation> Allreservation = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice =0;

        while (choice < 9) {

            if (choice == 8 || choice < 0) {
                break;
            } else if (choice == 1) {
                while (choice > 0 && choice < 10) {

                    if (choice == 1) {
                        System.out.println("Dans A-1.Afficher l'etat de l'hotel");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        choice = scanner.nextInt();
                        if (choice==1){
                            System.out.println("****************** Les chambres *****************");
                                System.out.println(hotel.toString());
                            System.out.println("****************** Les clients ******************");
                                System.out.println(hoteldatabase.toString());
                            System.out.println("****************** Les reservations ******************");
                                System.out.println(Allreservation.toString());
                        }
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice = scanner.nextInt();
                }
            } else if (choice == 2) {
                while (choice > 0 && choice < 10) {

                    if (choice == 2) {
                        System.out.println("Dans B-2.Afficher le nombre de chambres reservees");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        choice = scanner.nextInt();
                        int sum=0;
                        for (int i=0;i<hotel.size();i++){
                            Chambre ch=hotel.get(i);
                            if (ch.etat==true){
                                sum=sum+1;
                            }
                        }
                        System.out.println("Nombre des chambres reserve est "+sum);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice = scanner.nextInt();
                }
            } else if (choice == 3) {
                while (choice > 0 && choice < 10) {
                    if (choice == 3) {
                        System.out.println("Dans C-3.Afficher le nombre de chambres libres");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        choice = scanner.nextInt();
                        int sum=0;
                        for (int i=0;i<hotel.size();i++){
                            Chambre ch=hotel.get(i);
                            if (ch.etat==false){
                                sum=sum+1;
                            }
                        }
                        System.out.println("Nombre des chambres libre est "+sum);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice = scanner.nextInt();

                }
            } else if (choice == 4) {
                while (choice > 0 && choice < 10) {

                    if (choice == 4) {
                        System.out.println("Dans D-4.Afficher le numero de la premiere chambre vide");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        choice = scanner.nextInt();
                        for (int i=0;i<hotel.size();i++){
                            Chambre ch=hotel.get(i);

                            if (ch.isEtat()==false){
                                System.out.println(ch.toString());
                                break;
                            }
                        }
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice = scanner.nextInt();

                }
            } else if (choice == 5) {
                while (choice > 0 && choice < 10) {
                    if (choice == 5) {
                        System.out.println("Dans E-5.Afficher le numero la derniere chambre vide");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        choice = scanner.nextInt();
                        for (int i=0;i<hotel.size()-1;i++){
                            Chambre ch=hotel.get(hotel.size()-1);
                            if (ch.isEtat()==false){
                                System.out.println(ch.toString());
                                break;
                            }
                        }
                        break;
                    }
                    else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice = scanner.nextInt();
                }
            } else if (choice == 6) {
                while (choice > 0 && choice < 10) {
                    if (choice == 6) {
                        System.out.println("F-6.Reserver une chambre");
                        String username = "gg";
                        String pass = "gg";
                        String login;
                        String motDePass;
                        //compteur tentatives de mot de passe
                        int compteur = 3;
                        while (compteur > 0) {
                            System.out.println("Merci d'entrée votre login");
                            System.out.println("3 tentatives,reste " + compteur);
                            login = scanner.next();
                            System.out.println("Merci d'entrée votre mot de passe");
                            motDePass = scanner.next();

                            if (Objects.equals(login, username) && Objects.equals(motDePass, pass)) {
                                compteur = -1;
                                System.out.println("Login ok");
                                System.out.println("Merci de preciser le type de chambre 1-Single,2-Twin,3-Double,4-Suite");
                                choice = scanner.nextInt();

                                Chambre chselct=null;
                                switch(choice){

                                    case 1:
                                        for (int i=0;i<hotel.size();i++){
                                            Chambre ch=hotel.get(i);
                                            if (ch.isEtat()==false && ch instanceof ChambreSingle  ) {
                                                System.out.println("Single " +ch.toString());
                                                chselct=ch;
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (int i=0;i<hotel.size();i++){
                                            Chambre ch=hotel.get(i);
                                            if (ch.isEtat()==false && ch instanceof ChambreTwin  ) {
                                                System.out.println("Twin " +ch.toString());
                                                chselct=ch;
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (int i=0;i<hotel.size();i++){
                                            Chambre ch=hotel.get(i);
                                            if (ch.isEtat()==false && ch instanceof ChambreDouble  ) {
                                                System.out.println("Double " +ch.toString());
                                                chselct=ch;
                                                break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        for (int i=0;i<hotel.size();i++){
                                            Chambre ch=hotel.get(i);
                                            if (ch.isEtat()==false && ch instanceof ChambreSuite  ) {
                                                System.out.println("Suite " +ch.toString());
                                                chselct=ch;
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("Choix incorrect");
                                        break;
                                }
                                System.out.println(hoteldatabase.toString());
                                System.out.println("Merci de preciser le 'id' de client a partir de la liste");
                                int psselct = scanner.nextInt();

                                System.out.println("Merci de preciser le date de arrive au format yyyy,month,day");
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
                                Date timeStart = sdf.parse(scanner.next());
                                System.out.println("Merci de preciser le date de sortie au format yyyy,month,day");
                                Date timeEnd = sdf.parse(scanner.next());

                                System.out.println("**********************************");
                                System.out.println("id du chambre--"+chselct.getId());
                                System.out.println("id du persone--"+psselct);
                                System.out.println("dateStart--"+timeStart.toString());
                                System.out.println("dateEnd--"+timeEnd.toString());
                                System.out.println("**********************************");


                                Reservation r = new Reservation();

                                r.addCambreToReservation(chselct,hoteldatabase.get(psselct-1),timeStart,timeEnd);
                                //must have implementation of check for date
                                 for (int i=0;i<Allreservation.size();i++){
                                     Date j = Allreservation.get(i).getDateend();
                                   if (j.before(timeStart)){//nbre de jours entre les deux dates

                                      }
                                   }
                                Allreservation.add(r);


                                System.out.println("****************** Les chambres *****************");
                                System.out.println(hotel.toString());
                                System.out.println("****************** Les clients ******************");
                                System.out.println(hoteldatabase.toString());
                                System.out.println("****************** Les reservations ******************");
                                System.out.println(Allreservation.toString());
                                break;

                            }
                            else {
                                System.out.println("Verifier votre login et mot de passe");
                                compteur = compteur - 1;
                            }
                        }
                        System.out.println("Taper 0 pour revenir au menu principal");
                        choice = scanner.nextInt();
                    }
                    else {
                        System.out.println("Verifier votre chiffre 6");
                    }
                    choice = scanner.nextInt();
                }
            } else if (choice == 7) {
                while (choice > 0 && choice < 10) {
                    if (choice == 7) {
                        System.out.println("G-7.Afficher le nombre de chambres reservees");
                        String username = "gg";
                        String pass = "gg";
                        String login;
                        String motDePass;
                           //compteur tentatives de mot de passe
                        int compteur = 3;
                        while (compteur > 0) {
                            System.out.println("Merci d'entrée votre login");
                            System.out.println("3 tentatives,reste " + compteur);
                            login = scanner.next();
                            System.out.println("Merci d'entrée votre mot de passe");
                            motDePass = scanner.next();

                            if (Objects.equals(login, username) && Objects.equals(motDePass, pass)) {
                                compteur = -1;
                                System.out.println("Login ok");
                                System.out.println("Merci de selectioner le numero de reservation a supprimer");
                                int resselector = scanner.nextInt();

                                //same as for reservation
                               // r.removeCambreFromReservation(chselect,pselect);
                                System.out.println("La reservation est supprimé");
                            } else {
                                System.out.println("Verifier votre login et mot de passe");
                                compteur = compteur - 1;
                            }
                        }
                        System.out.println("Taper 0 pour revenir au menu principal");
                        choice = scanner.nextInt();
                    } else {
                        System.out.println("Verifier votre chiffre 7");
                    }
                    choice = scanner.nextInt();
                }
            } else if (choice == 0) {
                System.out.println("........................MENU HOTEL CDA JAVA.........");
                System.out.println();
                System.out.println("A-1.Afficher l'etat de l'hotel");
                System.out.println("B-2.Afficher le nombre de chambres reservees");
                System.out.println("C-3.Afficher le nombre de chambres libres");
                System.out.println("D-4.Afficher le numero de la premiere chambre vide");
                System.out.println("E-5.Afficher le numero la derniere chambre vide");
                System.out.println("F-6.Reserver une chambre//le prodgramme doite reserver la premiere chambre vide");
                System.out.println("G-7.Afficher le nombre de chambres reservees");
                System.out.println("Q-8.quitter");
                System.out.println(".....................................................");
                System.out.print("Votre choix est 0-Menu Principal - " + choice+"  -");
                choice = scanner.nextInt();
            }
        }
    }
}
