package JavaAdvanced.modulo3_DateTesting.ex5;

import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
verificare che la prima data è precedente alla seconda
verificare che la seconda data è successiva alla prima
verificare che le due date sono uguali ad ora
Stampa il risultato*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime myDate1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime myDate2 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        if (myDate1.equals(myDate2)){
            System.out.println("Le due date sono uguali!");
        }else {
            System.out.println("Le due date sono differenti!");
        }
    }
}
