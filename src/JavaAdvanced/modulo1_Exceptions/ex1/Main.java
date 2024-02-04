package JavaAdvanced.modulo1_Exceptions.ex1;

/*
Scrivere una funzione che controlli se un numero 'int' è in un determinato range, se lo è ritorna 'true'
se non lo è lancia un'eccezione
 */
public class Main {
    public static void main(String[] args) {
        try {
            int num = 50;
            int minNumber = 0;
            int maxNumber = 100;
            if (checkIfInRange(num, minNumber, maxNumber)) {
                System.out.println("Il numero si trova nel range.");
            } else {
                System.out.println("Il numero non si trova nel range.");
            }
        } catch (RangeCheckException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkIfInRange(int num, int limiteMassimo, int limiteMinimo)
            throws RangeCheckException {
        if (limiteMinimo > limiteMassimo) {
            throw new RangeCheckException("Lower limit is greater than upper limit.");
        }
        return num >= limiteMinimo && num <= limiteMassimo;
    }


}










