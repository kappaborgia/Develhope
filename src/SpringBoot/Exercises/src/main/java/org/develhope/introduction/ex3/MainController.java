package org.develhope.introduction.ex3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class MainController {
    @GetMapping("/ciao/{provincia}")
    public User print(@RequestParam(required = true) String nome,
                       @RequestParam(required = false, defaultValue = "") String cognome,
                      @RequestParam String citta){
        return new User(nome, cognome, "Ciao" + nome + " com'è il tempo a " + citta + "?");
    }

}
