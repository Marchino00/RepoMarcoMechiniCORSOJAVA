import java.util.ArrayList;
import java.util.Scanner;
//import 

public class Ristorante {

    public static void main(String[] args) {

        // Inizio Creazione utente !!!!!
        Boolean Controll = true;
        String AD = "ADMIN";
        String AD2 = "ADMIN2";
        Boolean Admin = true;

        do {

            // inserimento credenziali
            System.out.println("Inserisci Username");
            Scanner UserU = new Scanner(System.in);
            String Username = UserU.nextLine();
            System.out.println("Inserisci Password");
            Scanner UserP = new Scanner(System.in);
            String Password = UserP.nextLine();

            // Conferma credenziali
            System.out.println("Conferma Username");
            Scanner UserC = new Scanner(System.in);
            String UsernameC = UserC.nextLine();
            System.out.println("Conferma Password");
            Scanner UserPC = new Scanner(System.in);
            String PasswordC = UserPC.nextLine();

            // Controllo credenziali
            if (Username.equals(AD) && Password.equals(AD2)) {
                System.out.println("Sei un admin");
                System.out.println("-------------------------");
                Admin = true;
                Controll = true;

            } else if (Username.equals(UsernameC) && Password.equals(PasswordC)) {
                System.out.println("Username e password coincidono");
                System.out.println("-------------------------");
                Controll = true;

            } else {
                System.out.println("Username o password non coincidono");
                System.out.println("-------------------------");
                Controll = false;
            }

        } while (Controll == false);

        Boolean controll = true;
        Double Soldi = 0.00;
        Scanner scelta = new Scanner(System.in);
        Scanner sceltaFinale = new Scanner(System.in);
        Scanner S = new Scanner(System.in);

        // Creazione array del menu
        ArrayList<String> Menù = new ArrayList<String>();
        ArrayList<Integer> PrezzoM = new ArrayList<Integer>();
        ArrayList<Integer> Selezione = new ArrayList<Integer>();

        Menù.add("Pizza");
        PrezzoM.add(5);
        Menù.add("Lasagne");
        PrezzoM.add(2);
        Menù.add("Carbonare");
        PrezzoM.add(7);
        Menù.add("Acqua naturale");
        PrezzoM.add(8);

        while (controll == true) {

            if (Admin == true) {
                Soldi = 99999999.00;

            } else {
                // Insermento budget
                System.out.println("Quanti soldi vuoi aggiungere (Attenzione!! USARE LA VIRGOLA)?");
                Double SAgg = S.nextDouble();
                Soldi = Soldi + SAgg;
                System.out.println("-------------------------");
                System.out.println("Il tuo budget è: " + Soldi);
            }
            // Scelta menù
            System.out.println("Scegli: Menù Carrello o Esci");
            String risposta = scelta.nextLine();
            System.out.println("-------------------------");

            if (risposta.equals("Menù")) {

            } else if (risposta.equals("Carrello")) {
                if (Admin == true) {
                    System.out.println("Puoi cambiare il menu");
                } else {
                    // Soldi = Soldi - ;
                    System.out.println("Il tuo budget è: " + Soldi);

                }

            } else if (risposta.equals("Esci")) {
                String SceltaF = sceltaFinale.nextLine();

                if (SceltaF.equals("Esci")) {
                    controll = false;
                    System.out.println("Sei uscito");
                } else {

                }

            }
        } // Fine main

    }// Chiusura main
} // Classe ristorante
