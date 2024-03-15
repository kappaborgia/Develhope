package co.develhope.springcrudtest.Controllers;

import co.develhope.springcrudtest.Entities.Students;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(value = "test")
class StudentControllerTest {
    @Autowired
    private StudentController studentController;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;


    //NOTE: creiamo il nostro metodo una volta, per non doverlo riscrivere ogni volta.
    private Students createStudents() throws Exception{
        // crea un nuovo studente e passa i parametri tramite i set.
        // Attezione possiamo sia passare i paremetri all'interno delle parentesi tondi oppure
        // passiamo i parametri tramite i set
        Students students = new Students();
        //students.setId(1L);
        students.setName("Kevin");
        students.setSurname("Borgia");
        students.setWorking(true);
        // trasformiamo lo studente in un file JSON atraverso objectmapper
        String studentJson = objectMapper.writeValueAsString(students);
        // simuliamo la nostra chiamata direzionando la rotta
        MvcResult result = this.mockMvc.perform(post("/create")
                // diciamo il tipo di file che gli stiamo passando (JSON)
                .contentType(MediaType.APPLICATION_JSON)
                // passiamo il file JSON
                .content(studentJson))
                // ci aspettiamo che sia ok
                .andExpect(status().isOk())
                .andReturn();
        // il nostro studente JSON viene convertito nuovamente in oggetto
        return objectMapper.readValue(result.getResponse().getContentAsString(), Students.class);
    }



    //NOTE: creiamo il nostro metodo una volta, per non doverlo riscrivere ogni volta.
    private Students getAllStudentsFromaId(Long id) throws Exception{
        MvcResult result = this.mockMvc.perform(get("/id/" + id))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        // in queste 2 righe che seguono, abbiamo fatto la stessa cosa fatta nel metodo precedente
        // solo che abbiamo diviso il tutto in 2 righe.
        String studentsJson = result.getResponse().getContentAsString();
        return objectMapper.readValue(studentsJson, Students.class);

    }



    @Test
    void contextLoad(){
        assertThat(studentController).isNotNull();
    }

    @Test
    void createStudent() throws Exception {
        Students students = createStudents();
        assertThat(students.getId()).isNotNull();
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