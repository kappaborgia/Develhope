package co.develhope.SpringExercisesEmpolyee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class Controller {
    List<Employee> employees = new ArrayList<>();

    @GetMapping("/all")
    public List<Employee> printAllEmployees(){
        return employees;
    }
}
