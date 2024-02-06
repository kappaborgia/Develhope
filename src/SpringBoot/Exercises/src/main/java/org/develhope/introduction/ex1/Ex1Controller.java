package org.develhope.introduction.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class Ex1Controller {
    @GetMapping("/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String citta){
        return "Ciao " + nome + " com'è il tempo a " + citta + "?";
    }
}

