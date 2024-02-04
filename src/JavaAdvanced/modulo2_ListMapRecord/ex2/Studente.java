package JavaAdvanced.modulo2_ListMapRecord.ex2;
/*
Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
mettere in ordine la collezione e stampare il risultato*/
public class Studente {
    String name;
    int age;

    public Studente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return  '\n' + "Studente:" + '\n' +
                "name = " + name + '\n' +
                "age = " + age + '\n' + "--------------";
    }
}
