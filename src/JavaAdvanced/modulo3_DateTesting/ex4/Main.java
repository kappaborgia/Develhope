package JavaAdvanced.modulo3_DateTesting.ex4;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime myObj = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime newObj = myObj.plusYears(1).minusMonths(1).plusDays(7);
        String date = newObj.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY));
        System.out.println(date);


    }
}
