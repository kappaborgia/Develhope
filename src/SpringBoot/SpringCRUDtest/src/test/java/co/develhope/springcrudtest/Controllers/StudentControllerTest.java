package co.develhope.springcrudtest.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(value = "test")
class StudentControllerTest {

    @Test
    void createStudent() {
    }

    @Test
    void returnListAllStudents() {
    }

    @Test
    void getStudenteById() {
    }

    @Test
    void updateAttribute() {
    }

    @Test
    void updateIsWorking() {
    }

    @Test
    void deleteStudent() {
    }
}