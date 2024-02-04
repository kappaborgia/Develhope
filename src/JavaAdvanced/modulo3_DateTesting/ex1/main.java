package JavaAdvanced.modulo3_DateTesting.ex1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni*/
public class main {
    public static void main(String[] args) {
        OffsetDateTime Oggetto = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String data = Oggetto.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Esteso: " + data);
        data = Oggetto.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Lungo: " + data);
        data = Oggetto.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Medio: " + data);
        data = Oggetto.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Corto: " + data);
    }
}
