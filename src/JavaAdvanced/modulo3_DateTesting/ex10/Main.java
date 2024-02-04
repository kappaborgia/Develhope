package JavaAdvanced.modulo3_DateTesting.ex10;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate.dateFormatter(date);
    }
    public String[] dateFormatter(OffsetDateTime date){
        OffsetDateTime newDate= date.plusYears(1).minusMonths(1).plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", java.util.Locale.ITALY);
        String finalDate = newDate.atZoneSameInstant(ZoneId.of("Europe/Rome")).format(formatter);

        System.out.println(newDate);
        return new String[] {String.valueOf(newDate)};
    }
}
