import java.util.Scanner;

public class CicliEIteratori {
    public static void main(String[] args) {

        // X = 11 Y = 22 Z = 12.5
        // Inizializzazione variabili
        double x = 11;
        double y = 22;
        double z = 12.5;

        Boolean exit = true;

        // Inizion ciclo
        do {

            Scanner inputUser = new Scanner(System.in);
            System.out.println("Scegli Addizione, Sottrazione, Stampa o Esci");
            String risposta = inputUser.nextLine();
            // Prendi e salva input user

            // Inizio if addizione
            if (risposta.equals("Addizione")) {

                // Scanner per far scegliere quale variabiel usare
                Scanner Opzione = new Scanner(System.in);
                System.out.println("Scegli variabile da sommare (x) " + x + ", (y) " + y + " o (z) " + z);
                String Scelta = Opzione.nextLine();

                // Inizio if scelta x
                if (Scelta.equals("x")) {

                    // scanner per far scegliere quanto aggiungere
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi aggiungere?");
                    Double NAgg = N.nextDouble();
                    x = x + NAgg;
                    // System.out.println("Il Valore di x è: " + x);
                    System.out.println("-------------------------");

                    // Inizio if scelta y
                } else if (Scelta.equals("y")) {

                    // scanner per far scegliere quanto aggiungere
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi aggiungere?");
                    Double NAgg = N.nextDouble();
                    y = y + NAgg;
                    System.out.println("-------------------------");

                    // Inizio if scelta z
                } else if (Scelta.equals("z")) {

                    // scanner per far scegliere quanto aggiungere
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi aggiungere?");
                    Double NAgg = N.nextDouble();
                    z = z + NAgg;
                    System.out.println("-------------------------");

                }

                // Inizio if Sottrazione
            } else if (risposta.equals("Sottrazione")) {

                // Scanner per far scegliere quale variabiel usare
                Scanner Opzione = new Scanner(System.in);
                System.out.println("Scegli variabile da sottrarre (x) " + x + ", (y) " + y + " o (z) " + z);
                String Scelta = Opzione.nextLine();

                // Inizio if scelta x
                if (Scelta.equals("x")) {

                    // scanner per far scegliere quanto sottrarre
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi sottrarre?");
                    Double NSot = N.nextDouble();
                    x = x - NSot;
                    System.out.println("-------------------------");

                    // Inizio if scelta y
                } else if (Scelta.equals("y")) {

                    // scanner per far scegliere quanto sottrarre
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi sottrarre?");
                    Double NSot = N.nextDouble();
                    y = y - NSot;
                    System.out.println("-------------------------");

                    // Inizio if scelta z
                } else if (Scelta.equals("z")) {

                    // scanner per far scegliere quanto sottrarre
                    Scanner N = new Scanner(System.in);
                    System.out.println("Quanto vuoi sottrarre?");
                    Double NSot = N.nextDouble();
                    z = z - NSot;
                    System.out.println("-------------------------");

                }

                // Inizion if stampa
            } else if (risposta.equals("Stampa")) {

                Scanner Opzione = new Scanner(System.in);
                System.out.println("Scegli cosa stampare (x), (y) o (z) ");
                String Scelta = Opzione.nextLine();

                // Inizio if scelta x
                if (Scelta.equals("x")) {
                    System.out.println("Il Varlore di x è: " + x);
                    System.out.println("-------------------------");

                    // Inizio if scelta y
                } else if (Scelta.equals("y")) {
                    System.out.println("Il Varlore di y è: " + y);
                    System.out.println("-------------------------");

                    // Inizio if scelta z
                } else if (Scelta.equals("z")) {
                    System.out.println("Il Varlore di z è: " + z);
                    System.out.println("-------------------------");

                }

                // Inizio if esci
            } else if (risposta.equals("Esci")) {
                System.out.println("Grazie e Arrivedereci");
                exit = false;
            }

        } while (exit == false);
    }

}