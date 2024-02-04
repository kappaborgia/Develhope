package JavaAdvanced.modulo4_DesignPattern.ex1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo*/
public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = BigDecimal.valueOf(10);
        BigDecimal number2 = BigDecimal.valueOf(5);
        Aritmetica operazione = Aritmetica.ADDIZIONE;
        BigDecimal risultato = eseguiOperazione(operazione, number1, number2);

        System.out.println("Operazione: " + operazione + '\n' +
                "Numero 1: " + number1 + '\n' +
                "Numero 2: " + number2 + '\n' +
                "Risultato: " + risultato);
    }

    private static BigDecimal eseguiOperazione(Aritmetica operazione, BigDecimal operando1, BigDecimal operando2) {
        return operazione.esegui(operando1,operando2);
    }



}
