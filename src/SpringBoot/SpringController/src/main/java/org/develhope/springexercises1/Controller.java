package org.develhope.springexercises1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("v1")
@RestController
public class Controller {

    @GetMapping("/ciao")
    public String ciao(@RequestParam String name, @RequestParam String citta){

        return "Ciao " + name + " com'è il tempo a " + citta;
    }
}
