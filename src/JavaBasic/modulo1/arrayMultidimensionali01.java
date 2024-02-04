package JavaBasic.modulo1;
/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita
con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga */

public class arrayMultidimensionali01 {
    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sommaPrimaRiga = sommaPrimaRiga(matrice);
        System.out.println("La somma degli elementi nella prima riga è: " + sommaPrimaRiga);
    }

    public static int sommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int j = 0; j < matrice[0].length; j++) {
            somma += matrice[0][j];
        }
        return somma;
    }
}
