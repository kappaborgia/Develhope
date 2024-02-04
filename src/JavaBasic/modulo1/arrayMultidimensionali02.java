package JavaBasic.modulo1;
/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare le sue
righe e le sue colonne stampandola a video. Matrice di partenza
*/

public class arrayMultidimensionali02 {
    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matrice di partenza:");
        stampaMatrice(matrice);

        int[][] matriceRisultato = scambiaRigheColonne(matrice);

        System.out.println("Matrice risultato:");
        stampaMatrice(matriceRisultato);
    }

    public static int[][] scambiaRigheColonne(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] risultato = new int[colonne][righe];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                risultato[j][i] = matrice[i][j];
            }
        }

        return risultato;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
