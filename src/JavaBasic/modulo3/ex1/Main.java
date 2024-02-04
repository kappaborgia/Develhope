package JavaBasic.modulo3.ex1;

/* Crea un programma che contenga una classe chiamata Animale
ed un metodo chiamato 'faiilVerso()' che  stampi il verso
dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del 
metodo 'faiilVerso' per miagolare.
 */
public class Main {
    public static void main(String[] args) {
        // creazione di un istanza di Animale
        Animale animaleGenerico = new Animale();
        // chiamate del metodo faiIlVerso del gatto
        animaleGenerico.faiIlVerso();

        // creazione di un'istanza di Gatto
        Gatto gatto = new Gatto();
        gatto.faiIlVerso();

           
    }
}
