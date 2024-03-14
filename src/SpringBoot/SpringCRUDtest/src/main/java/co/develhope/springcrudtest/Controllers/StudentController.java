package co.develhope.springcrudtest.Controllers;

import co.develhope.springcrudtest.Entities.Students;
import co.develhope.springcrudtest.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    void createStudent(@RequestBody Students student){
        studentService.createStudent(student);
    }

    @GetMapping("/list")
    List<Students> returnListAllStudents(){
        return studentService.studentList();
    }

    @GetMapping("/{id}")
    Students getStudenteById(@PathVariable Long id){
        return studentService.studentsById(id);
    }

    @PatchMapping("/updateAttribute/{id}")
    Students updateAttribute(@PathVariable Long id, @RequestParam String updateAttribute, @RequestParam String updateAttribute2){
        return studentService.updateAttribute(id,updateAttribute,updateAttribute2);
    }

    @PatchMapping("/updateIsWorking")
    Students updateIsWorking(@PathVariable Long id, @RequestParam Boolean isWorking){
        return studentService.updateIsWOrking(id, isWorking);
    }

    @DeleteMapping("/delete/{id}")
    void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }










}
