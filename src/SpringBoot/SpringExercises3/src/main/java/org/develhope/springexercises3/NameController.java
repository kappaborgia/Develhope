package org.develhope.springexercises3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/nome/{nome}")
    public String getName(@RequestParam User name){

        return name.getName();
    }
    @GetMapping("/reverseName/{name}")
    public String getReverseName(@RequestParam String name){
        StringBuilder reverseName = new StringBuilder(name).reverse();
        return reverseName.toString();
    }

    public NameController() {

        new User("Alberto");
    }
}
