
fun main() {

    // Inizializzo le variabili
    var condition = true
    var option : Int
    var utente = "Marco"
    var pass = "123"
    var Admin = "Admin"
    var Adminpass = "321"
    var Scelta : Int
    var login : Int
    var LogUs : String
    var PasUs : String
    var LogAd : String
    var PasAd : String
    var checkAd = true
    var checkUs = true
    var Menu : Int = 0
    var menu = true

    // Inizio do While che prende tutto
    do {
        println("------------")
        println("Sei un Admin (1) o un  Utente (2)")
        println("------------")
        login = readLine()!!.toInt()

        // Login
        if (login == 1) {
            do {
                // Login Admin
                println("Inserisci username")
                LogAd = readLine()!!.toString()
                println("Inserisci password")
                PasAd = readLine()!!.toString()

                if (LogAd.equals(Admin) && PasAd.equals(Adminpass)) {
                    println("Sei un Admin")
                    Menu = 1
                    checkAd = false
                } else {
                    println("Username o Password errati, ritenta")
                }

            } while (checkAd == true)
            // fine if login == 1
        } else if (login == 2) {
            do {
                // Login User
                println("Inserisci username")
                LogUs = readLine()!!.toString()
                println("Inserisci password")
                PasUs = readLine()!!.toString()

                if (LogUs.equals(utente) && PasUs.equals(pass)) {
                    println("Sei un User")
                    Menu = 2
                    checkUs = false
                } else {
                    println("Username o Password errati, ritenta")
                }

            } while (checkUs == true)
        } // fine else if login == 2

        // Inizio menù
        if (Menu == 1){
            // Inizio menù admin
        }  // Fine Menu == 1
        else if (Menu == 2) {
            // Inizio menù user
            do {

                println("------Menù------")
                println("Scegli: ")
                println("Quiz (1)")
                println("Esci (2)")
                option = readLine()!!.toInt()
                if (option==1){

                    Scelta = readLine()!!.toInt()

                    if (Scelta == 1){

                    } else {
                        println("Sei uscito")
                        condition = true
                    }


                } else if (option == 2){

                } else {

                }


            } while (condition == true)
        } // fine Menu == 2
        else {
            menu = false
        }

    } while (menu == true)
// Fine do While che prende tutto

} // Chiusura main