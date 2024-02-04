package JavaAdvanced.modulo2_ListMapRecord.ex1;

public class Studente {
    String name;
    int age;

    public Studente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return '\n' + "Studente:" + '\n' +
                "name = " + name + '\n' +
                "age = " + age + '\n' + "-----------";
    }
}
