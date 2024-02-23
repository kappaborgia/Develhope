package org.develhope.springexercises2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class Controller {
    @GetMapping("/saluto")
    public User saluto(@RequestParam String name,
                       @RequestParam String city){

        return new User(name, city, "Ciao " + name + ". Come è il tempo a " + city);
        //return new User(name, city, saluto);

    }
}
