package JavaAdvanced.modulo3_DateTesting.ex9;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate.dateFormatter(date);
    }
    public String[] dateFormatter(OffsetDateTime date){
        int dateYears = date.getYear();
        Month dateMonth = date.getMonth();
        int dateDay = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dateYears);
        System.out.println(dateMonth);
        System.out.println(dateDay);
        System.out.println(dayOfWeek);

        return new String[] {String.valueOf(dateYears), String.valueOf(dateMonth), String.valueOf(dateDay), String.valueOf(dayOfWeek)};
    }
}
