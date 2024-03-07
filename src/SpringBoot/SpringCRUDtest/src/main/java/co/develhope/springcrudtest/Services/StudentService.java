package co.develhope.springcrudtest.Services;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class
StudentService {
    @Autowired
    StudentsRepository studentsRepository;

    // crea un nuovo studente
    public void createStudent(Students students){
        studentsRepository.save(students);
    }

    // ritorna la lista degli studenti creati
    public List<Students> studentList(){
        return studentsRepository.findAll();
    }

    // ricerca uno studente tramite id
    public Students studentsById(Long id) {
        if(studentsRepository.findById(id).isPresent()){
            return studentsRepository.getById(id);
        } else {
            throw new NoSuchElementException("Studente co id:" + id + " non trovato");
        }
    }

    //per aggiornare il valore isWorking value:
    //passando primary key come path variable
    //passando request param con nome working
    public Students updateIsWOrking(Long id, Boolean isWorking){
        Students students = studentsRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Studente con id:" + id + " non trovato"));
        students.setWorking(isWorking);
        return students;
    }

    // per aggiornare gli attributi
    public Students updateAttribute(Long id, String updateAttribute, String updateAttribute2){
        Students students = studentsRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Studente con id:" +  id + " non trovato"));
        students.setName(updateAttribute);
        students.setSurname(updateAttribute2);
        studentsRepository.save(students);
        return students;
    }

    //per cancellare uno Student
    public void deleteStudent(@PathVariable Long id){
        studentsRepository.deleteById(id);
    }































}
