package JavaBasic.modulo3.ex5;
/*
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato
calcolaArea(). Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
ed implementano il metodo per il calcolo dell'area.
 */
public class Rettangolo implements Forma {

    private final int base;
    private final int height;

    // costruttore
    public Rettangolo(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcolaArea() {
        int area = base * height;
        System.out.println("L'area del rettangolo è: " + area);
        return 0;
    }
}
