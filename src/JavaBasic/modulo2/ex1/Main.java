package JavaBasic.modulo2.ex1;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("mario", "rossi", 1234);
        System.out.println("Nome: " + studente1.getnome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Matricola: " + studente1.getID());
        System.out.println();
 
 
        studente1.setNome("luigi");
        studente1.setCognome("bernardo");
        studente1.setID(1344);
        System.out.println("Nome: " + studente1.getnome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Matricola: " + studente1.getID());
        System.out.println();



        studente1.setNome("valentina");
        studente1.setCognome("bianchi");
        studente1.setID(1224);
        System.out.println("Nome: " + studente1.getnome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Matricola: " + studente1.getID());
        System.out.println();

        


    }
}
