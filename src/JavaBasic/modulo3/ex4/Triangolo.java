package JavaBasic.modulo3.ex4;
/*
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo
astratto chiamato cacloaArea(). Crea poi due sottoclassi Rettangolo e Triangolo
che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera
specifica.
 */
public class Triangolo extends Forma {
    private final int Base;
    private final int Height;

    public Triangolo(int base, int height){
        this.Base = base;
        this.Height = height;
    }

    @Override
    public void calcoloArea() {
        int area = Base * Height / 2;
        System.out.println("L'area del triangolo è: " + area);
    }
}
