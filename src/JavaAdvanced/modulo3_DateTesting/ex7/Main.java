package JavaAdvanced.modulo3_DateTesting.ex7;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        myDate.dateTesting(date);
    }
    public String[] dateTesting(OffsetDateTime date){
        String newDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String newDate1 = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String newDate2 = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(newDate);
        System.out.println(newDate1);
        System.out.println(newDate2);

        return new String[] {newDate,newDate1,newDate2};
    }
}
