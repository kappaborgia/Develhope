package JavaAdvanced.modulo3_DateTesting.ex3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE")));

        String dateString = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        System.out.println(dateString);

    }
}