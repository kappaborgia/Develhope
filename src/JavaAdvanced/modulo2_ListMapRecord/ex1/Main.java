package JavaAdvanced.modulo2_ListMapRecord.ex1;

import java.util.ArrayList;
import java.util.List;

/* Creare una classe Student che accetti nel costruttore il parametro name (String e age int)
* in questa classe avere i metodi pubblici per ottenere le informazioni
* creare un arraylist con n elementi e stamparlo in console
* aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/
public class Main {
    public static void main(String[] args) {
        List<Studente> lista = createList();

        System.out.println("Lista non aggiornata: " + lista);
        Studente alunno3 = new Studente("Samuel", 40);
        Studente alunno4 = new Studente("Gioia", 23);

        //System.out.println("Lista aggiornata" + addStudent(alunno3, lista));
        List<Studente> list2 = addStudent(alunno3,lista);

        List<Studente> list3 = addStudent(alunno4,list2);
        System.out.println("Lista aggiornata 2" + list3);

    }
    public static List<Studente> createList(){
        Studente alunno1 = new Studente("Davide", 14);
        Studente alunno2 = new Studente("Samantha", 34);
        List<Studente> list = new ArrayList<>();
        list.add(alunno1);
        list.add(alunno2);
        return list;

    }
    public static List<Studente> addStudent(Studente studente, List<Studente> lista ){
        lista.add(studente);
        return lista;


    }

}
