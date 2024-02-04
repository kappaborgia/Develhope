package JavaBasic.modulo3.ex2;
/* Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() 
che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() 
per calcolare l'area del rettangolo. */
public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di Forma
        Forma formaGenerica = new Forma();
        // Chiamata al metodo calcolaArea della forma generica
        formaGenerica.calcolaArea();

        // Creazione di un'istanza di Rettangolo 
        Rettangolo rettangolo = new Rettangolo(4, 6);
        // Chiamata del metodo calcolaArea()
        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo(6, 18);
        triangolo.calcolaArea();
    }
}
