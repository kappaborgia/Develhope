package JavaAdvanced.modulo1_Exceptions.ex3;
/* Scrivere una funzione che provi a dividere un numero per zero e catturi l'eccezione leggendone il
* messaggio*/
public class Main {
    public static void main(String[] args){
        dividiNumero();
    }
    public static void dividiNumero(){
        try{

            int num = 4;
            int result = num / 0;
            System.out.println("Risultato: " + result);

        } catch(ArithmeticException e){
            System.out.println("Non puoi dividere per zero");
        }

    }

}
