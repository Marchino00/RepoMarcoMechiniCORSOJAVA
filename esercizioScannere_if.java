import java.util.Scanner; // Importo le funzionalita scanner della libreria di java until


class esercizioScannere_if { // Inizio la classe
    public static void main(String[] args) { // Inizio main

        //Valorizzo le variabili
        int A = 3;
        int B = 13;
        int C = 13;

        //Prova if in sequenza
        if (A == B) { //Paragone la variabile A alla variabile B
            System.out.println("A e B hanno lo stesso valore");
        }
        if (A <= B) { //Paragone la variabile A alla variabile B
            System.out.println("A è minore di B");
        }
        if (B == C) { //Paragone la variabile B alla variabile C
            System.out.println("B e C hanno lo stesso valore");
        }

        //Prova if annidati
        if (B == C) {
            System.out.println("B e C hanno lo stesso valore");
            if (B >= A) {
                System.out.println("B è maggiore di A");
            }
        }

        

    } // Fine main
} // Fine classe