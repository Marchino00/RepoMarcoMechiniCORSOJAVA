import java.util.Scanner;
import java.util.ArrayList;
/* ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please enter a positive number ... ");  
        Scanner INPUT = new Scanner(System.in);
        while (INPUT.nextInt() > 0) {   
            list.add(INPUT.nextInt()); 
            System.out.println(list); */

public class aRRAYeSERCIZIO {
    public static void main(String[] args) {

        Boolean Controll = true;
        Scanner scelta = new Scanner(System.in);
        Scanner inserimento = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        Scanner INPUT = new Scanner(System.in);

        do {
            if (Controll == true) {

                // Scelta menù
                System.out.println("Scegli: (Agg) Aggiungi o Esci");
                String risposta = scelta.nextLine();
                System.out.println("-------------------------");

                // Scelta dove vuoi aggiungere
                if (risposta.equals("Agg")) {

                    // Chiedo all'utente in quale array vuole datoerire
                    System.out.println("Scegli in quale array vuoi inserire i dati: (0) Interi o (1) Stringhe");
                    int dato = inserimento.nextInt();
                    System.out.println("-------------------------");

                    if (dato == 0) {

                        System.out.println("Scegli che valore inserire");
                        // Scrivere dato da inserire numero e inserirlo nello scanner
                        list.add(INPUT.nextInt());
                        System.out.println("-------------------------");

                    } else if (dato == 1) {

                        System.out.println("Scegli che parola inserire");
                        // Scrivere dato da inserire stringa e inserirlo nello scanner
                        list2.add(INPUT.nextLine());
                        System.out.println("-------------------------");

                    }
                    // Esce dal ciclo
                } else if (risposta.equals("Esci")) {
                    Controll = false;
                    System.out.println("Questo è il contenuto dell'array " + list);
                    System.out.println("-------------------------");
                    System.out.println("Questo è il contenuto dell'array " + list2);
                    System.out.println("-------------------------");
                    System.out.println("Sei uscito");
                }
            } // chiusura if

        } while (Controll == true);

    } // chiusura main
}// chiusura classe
