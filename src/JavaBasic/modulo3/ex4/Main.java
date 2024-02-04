package JavaBasic.modulo3.ex4;
/*
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo
astratto chiamato cacloaArea(). Crea poi due sottoclassi Rettangolo e Triangolo
che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera
specifica.
 */
public class Main {
     public static void main(String[] args){
         Rettangolo myRettangolo = new Rettangolo(6,4);
         myRettangolo.calcoloArea();

         Triangolo myTriangolo = new Triangolo(3,6);
         myTriangolo.calcoloArea();

     }
}
