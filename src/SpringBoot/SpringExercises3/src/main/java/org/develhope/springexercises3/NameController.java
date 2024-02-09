package org.develhope.springexercises3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/nome/{name}")
    public String getName(@PathVariable String name){
        return name;
    }
    @GetMapping("/reverseName")
    public String getReverseName(@RequestParam String name){
        StringBuilder reverseName = new StringBuilder(name).reverse();
        return reverseName.toString();
    }

    public NameController() {

        new User("Alberto");
    }
}
