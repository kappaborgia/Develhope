package JavaAdvanced.modulo2_ListMapRecord.ex4;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/*Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.*/
public class Main {
    public static void main(String[] args) {
        // Primo metodo di inizializzazione:
        Map<String,String> mappa = new HashMap<String,String>();
        mappa.put("Italia", "Roma");
        mappa.put("United Stated of America", "Washington");
        mappa.put("Thailandia", "Bangkok");
        System.out.println(mappa);

        // Secondo metodo di inizializzazione:
        Map<String,String> maps = Map.of("PA","Palermo","TO","Torino","MI","Milano");
        System.out.println(maps);

        //Terzo metodo di inizializzazione:
        Map<String,String> CAPmaps = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String,String>("00010", "Gallicano nel lazio"),
                new AbstractMap.SimpleEntry<String,String>("00036", "Palestrina"),
                new AbstractMap.SimpleEntry<String,String>("00039", "Zagarolo")
        ));
        System.out.println(CAPmaps);




    }
}
