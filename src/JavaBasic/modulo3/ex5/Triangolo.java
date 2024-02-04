package JavaBasic.modulo3.ex5;
/*
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato
calcolaArea(). Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
ed implementano il metodo per il calcolo dell'area.
 */
public class Triangolo implements Forma {

    private final int Base;
    private final int Height;

    public Triangolo(int base, int height){
        this.Base = base;
        this.Height = height;
    }
    @Override
    public float calcolaArea() {
        int area = Base * Height / 2;
        System.out.println("L'area del triangolo è: " + area);

        return 0;
    }
}
