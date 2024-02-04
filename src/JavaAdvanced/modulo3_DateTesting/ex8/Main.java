package JavaAdvanced.modulo3_DateTesting.ex8;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate.dateFormatter(date);
    }
    public String[] dateFormatter(OffsetDateTime date){
        String newDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(newDate);
        return new String[] {newDate};
    }
}
