import java.util.Scanner; //Importo la libreria Scanner
import java.util.Random; //Importo la libreria per il numero casuale

class SassoCartaForbice {

    /*
     * Controlla il vincitore e restituisci 0 se partià 1 se vincitore è user, 2 se
     * vincitore è pc, 3 Errore
     */

    public static int ControllaVincitore(int giocata, int giocataPc) {

        int Vincitore = 0;

        // switch per selezionare vincitore con casistiche
        switch (giocata) {
            case 0:
                if (giocataPc == 0) {
                    System.out.println("User ha scelto sasso");
                    System.out.println("Pc ha scelto sasso");
                    System.out.println("Parità, sasso e sasso");
                } else if (giocataPc == 1) {
                    System.out.println("User ha scelto sasso");
                    System.out.println("Pc ha scelto carta");
                    System.out.println("Pc vince, carta batte sasso");
                    Vincitore = 2;
                } else {
                    System.out.println("User ha scelto sasso");
                    System.out.println("Pc ha scelto forbici");
                    System.out.println("User vince, sasso batte forbici");
                    Vincitore = 1;
                }

                break;

            case 1:
                if (giocataPc == 0) {
                    System.out.println("User ha scelto carta");
                    System.out.println("Pc ha scelto sasso");
                    System.out.println("User vince, carta batte sasso");
                    Vincitore = 1;
                } else if (giocataPc == 1) {
                    System.out.println("User ha scelto carta");
                    System.out.println("Pc ha scelto carta");
                    System.out.println("Parità, carta e carta");

                } else {
                    System.out.println("User ha scelto carta");
                    System.out.println("Pc ha scelto forbici");
                    System.out.println("Pc vince, forbici batte carta");
                    Vincitore = 2;
                }
                break;

            case 2:
                if (giocataPc == 0) {
                    System.out.println("User ha scelto forbici");
                    System.out.println("Pc ha scelto sasso");
                    System.out.println("Pc vince, sasso batte forbici");
                    Vincitore = 2;
                } else if (giocataPc == 1) {
                    System.out.println("User ha scelto sasso");
                    System.out.println("Pc ha scelto carta");
                    System.out.println("User vince, sasso batte carta");
                    Vincitore = 1;

                } else {
                    System.out.println("User ha scelto forbici");
                    System.out.println("Pc ha scelto forbici");
                    System.out.println("Parità, forbici e forbici");
                }
                break;
            default:
                Vincitore = 3;
                System.out.println("Devi scegliere tra 0, 1 o 2 non altri numeri, susu ce la puoi fare");
        }
        // fine switch

        return Vincitore;

    }

    public static void main(String[] args) {

        // Varaibili per conteggiare le vittorie
        int vittorieUser = 0;
        int vittoriePc = 0;

        // Variabile di controllo per giocare
        boolean stiamoGiocando = true;

        // Ciclo partite
        while (stiamoGiocando) {

            System.out.println("Scegli tra sasso(0), carta (1), forbice(2)");

            // Prendi e salva input giocatore
            Scanner inputUser = new Scanner(System.in);
            int giocata = inputUser.nextInt();

            // Crea e salva giocata Pc (valori da 0 a 2)
            Random numeRandom = new Random();
            int giocataPc = numeRandom.nextInt(3);

            // Salva vincitore in variabile restiruita da funzione
            int Vincitore = ControllaVincitore(giocata, giocataPc);

            // Stampa a schermo punteggio attuale
            if (Vincitore == 0) {
                System.out.println("------------Punteggio------------");
                System.out.println("Punteggio User: " + vittorieUser);
                System.out.println("Punteggio Pc: " + vittoriePc);

            } else if (Vincitore == 1) {
                vittorieUser++;
                System.out.println("------------Punteggio------------");
                System.out.println("Punteggio User: " + vittorieUser);
                System.out.println("Punteggio Pc: " + vittoriePc);

            } else if (Vincitore == 2) {
                vittoriePc++;
                System.out.println("------------Punteggio------------");
                System.out.println("Punteggio User: " + vittorieUser);
                System.out.println("Punteggio Pc: " + vittoriePc);

            }

            System.out.println("-----------------------------------------------");

            // Chiedi conferma nuova partita
            System.out.println("Vuoi continuare a giocare? Yes(0) No (altro numero)");
            int risposta = inputUser.nextInt();

            // Se la risposta è diversa da 0 (No) esci da ciclo
            if (risposta != 0) {
                stiamoGiocando = false;
            }
            System.out.println("-----------------------------------------------");

        }

    }
}
