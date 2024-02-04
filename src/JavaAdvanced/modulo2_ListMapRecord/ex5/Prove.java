package JavaAdvanced.modulo2_ListMapRecord.ex5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Prove {
    public static void main(String[] args) {
        OrderAndPrint();
    }
    public static void OrderAndPrint(){
        Map<Integer,String> Q2 = new LinkedHashMap<>();
        Q2.put(1,"max");
        Q2.put(2,"ff");
        Q2.put(3,"dd");
        System.out.println(Q2);
    }
}
