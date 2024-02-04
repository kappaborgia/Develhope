// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca la tabellina aritmetica 
// di quel numero che dovrà essere stampata a video.

public class cicloFor01 {
    public static void main(String[] args) {
        int numero = 2;
        tabellina(numero);
    }
    public static void tabellina(int numero){
        for(int i = 1; i <= 10; i++ ){
            int moltiplicazione = numero * i;
            System.out.println(numero + "x" + i + " = " + moltiplicazione );
        }
    }
    
}
