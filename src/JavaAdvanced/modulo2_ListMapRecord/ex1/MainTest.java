package JavaAdvanced.modulo2_ListMapRecord.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1() {

        List<Studente> lista = Main.createList();
        assertFalse(lista.isEmpty());

    }

    @Test
    void test2() {
        List<Studente> lista = Main.createList();
        assertNotNull(lista);
    }

    @Test
    void test3() {
        List<Studente> lista = Main.createList();
        Studente alunno3 = new Studente("Samuel", 40);

        List<Studente> lista1 = Main.createList();
                Main.addStudent(alunno3,lista);

        assertNotEquals(lista,lista1);

    }
}