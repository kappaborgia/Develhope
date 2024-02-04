// Definisci un metodo che calcoli la media tra 3 numeri e restituisca 
// il risultato che dovrà essere stampato.

public class operatoriAritmetici02 {
   public static void main(String[] args){
    double x = 4;
    double y = 3.5;
    double z = 10;

    System.out.println("la media dei voti è: " + media(x, y, z));
   } 
    
   public static double media(double x, double y, double z){
    double mediaOfnumber = (x + y + z) / 3;
    return mediaOfnumber;

   }
}
