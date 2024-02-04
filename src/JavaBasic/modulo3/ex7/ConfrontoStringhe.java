package JavaBasic.modulo3.ex7;

/*
Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti"
basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
 */
public class ConfrontoStringhe {

    public void confrontoStringhe() {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");







        if (sb1.compareTo(sb2) == 0){
            System.out.println("Le due stringhe sono uguali");

        } else {
            System.out.println("Le due stringhe sono differenti");
        }
    }


}