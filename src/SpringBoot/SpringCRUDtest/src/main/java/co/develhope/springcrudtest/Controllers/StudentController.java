package co.develhope.springcrudtest.Controllers;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    void createStudent(@RequestBody Students student){
        studentService.createStudent(student);
    }

    @GetMapping
    List<Students> returnListAllStudents(){
        return studentService.studentList();
    }

    @PutMapping("/{id}")
    Students getStudenteById(@PathVariable Long id){
        return studentService.studentsById(id);
    }
}
