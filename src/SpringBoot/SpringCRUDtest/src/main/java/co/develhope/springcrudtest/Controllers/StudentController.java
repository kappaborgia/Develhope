package co.develhope.springcrudtest.Controllers;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    void createStudent(@RequestBody Students student){
        studentService.createStudent(student);
    }

    @GetMapping
    List<Students> returnListAllStudents(){
        return studentService.studentList();
    }

    @GetMapping("/studentbyid/{id}")
    Students getStudenteById(@PathVariable Long id){
        return studentService.studentsById(id);
    }
}
