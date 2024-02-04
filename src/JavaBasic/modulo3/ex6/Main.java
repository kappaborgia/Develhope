package JavaBasic.modulo3.ex6;

public class Main {

    public static void main(String[] args) {
            Triangolo triangolo = new Triangolo(3, 4);
            Rettangolo rettangolo = new Rettangolo(5, 6);

            System.out.println("Area del triangolo: " + triangolo.calcolaArea());
            System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        }
}


