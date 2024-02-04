package JavaBasic.modulo3.ex5;
/*
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato
calcolaArea(). Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
ed implementano il metodo per il calcolo dell'area.
 */
public class Main {
    public static void main(String[] args){
        Rettangolo myRettangolo = new Rettangolo(4,5);
        Triangolo myTriangolo = new Triangolo(3,6);

        myRettangolo.calcolaArea();
        myTriangolo.calcolaArea();
    }
}
