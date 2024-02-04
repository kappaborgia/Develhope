package JavaAdvanced.modulo4_DesignPattern.ex1;

import java.math.BigDecimal;

public enum Aritmetica {
    ADDIZIONE{
        BigDecimal esegui(BigDecimal operando1, BigDecimal operando2){
            return operando1.add(operando2);
        }
    };

    abstract BigDecimal esegui(BigDecimal operando1, BigDecimal operando2);
}
