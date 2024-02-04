package JavaBasic.modulo3.ex8;
/*
Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico
all'interno di una stringa e lo stampi.
Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere
in unicode o una stringa di errore. Per la creazione della stringa di risultato dovrebbe essere
utilizzato StringBuilder.
 */
public class CodiceUnicode {

    private final String name;
    private final int position;

    public CodiceUnicode(String nome, int posizione){
        this.name = nome;
        this.position = posizione;
    }

    public String ottieniUnicode(){
        StringBuilder risultato = new StringBuilder();
        if (position >= 0 && position < name.length() ){
            char carattere = name.charAt(position);
            risultato.append("Il carattere UniCode all'indice: ").append(position).append(" nella stringa ").append(name).append(" è: ").append((int) carattere);

        } else {
            risultato.append("Errore: indice non valido");

        }
        return risultato.toString();
    }

}
