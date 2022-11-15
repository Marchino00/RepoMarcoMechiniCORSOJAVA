import java.util.ArrayList;
import java.util.Scanner;

public class EsPassword {
    public static void main(String[] args) {

        // ArrayList<String> = new ArrayList<String>();

        Boolean Controll = true;
        Boolean Controll2 = true;
        Scanner scelta = new Scanner(System.in);

        do {
            if (Controll == true) {

                // Controllare che venganon inseriti dei valori al loro interno e chiedere di
                // reinserirli

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

                    if (Username.equals(UsernameC) && Password.equals(PasswordC)) {
                        System.out.println("Username e password coincidono");
                        // continue;

                    } else {
                        System.out.println("Username o password non coincidono");
                        Controll2 = false;

                    }

                } while (Controll2 == true);

                // Scelta menù
                System.out.println("-------------------------");
                System.out.println("MENU'");
                System.out.println("Aggiungi ad Array Stringhe (0)");
                System.out.println("Aggiungi ad Array Numeri (1)");
                System.out.println("Stampa (2)");
                System.out.println("Esci (3)");
                int risposta = scelta.nextInt();
                System.out.println("-------------------------");

                // Scelta dove vuoi aggiungere
                if (risposta == 0) {

                } else if (risposta == 3) {
                    Controll = false;
                    System.out.println("Sei uscito");
                }

            } // chiusura if

        } while (Controll == true);

    }// Chiusura main
}// Chiusura classe
