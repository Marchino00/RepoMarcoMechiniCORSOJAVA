class testRepository {
    public static void main(String[]args) {


        // valorizzo le variabili
        double uno = 'b';
        double due = 123.34;
        double tre = 1;
        Boolean Bool1 = true;
        Boolean Bool2 = false;

        // creo le variabili che valorizzo in seguito
        double somma;
        double totale;

        //Condizione per cui se la condizione è vera stampa evviva
        if (Bool1 == !(Bool2)) {
            
            // sommo le varaibili
            somma = uno += due += tre;

            // divito la somma per 3
            totale = somma /= 3;

            System.out.println(somma);
            System.out.println(totale);
            //Se funziona stampa "Evviva"
            System.out.println("Evviva");

        } else {
            //Se non funziona stampa "Mi dispiace"
            System.out.println("Mi dispiace");

        }
    }
}
