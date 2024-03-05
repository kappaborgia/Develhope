package co.develhope.springcrudtest.Services;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;


public class StudentService {
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




}
