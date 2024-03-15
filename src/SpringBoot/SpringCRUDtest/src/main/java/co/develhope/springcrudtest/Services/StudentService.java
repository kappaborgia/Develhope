package co.develhope.springcrudtest.Services;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class
StudentService {
    @Autowired
    StudentsRepository studentsRepository;

    // crea un nuovo studente
    public Students createStudent(Students students){
        return studentsRepository.save(students);
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
        studentsRepository.save(students);
        return students;
    }

    // per aggiornare gli attributi
    public Students updateAttribute(Long id, Students students){
        studentsRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Studente con id:" +  id + " non trovato"));
        studentsRepository.save(students);
        return students;
    }

    //per cancellare uno Student
    public void deleteStudent(Long id){
        studentsRepository.deleteById(id);
    }































}
