package co.develhope.SpringSwagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/printName")
    @Operation(summary = "restituisci nome inserito")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "valid input"),
            @ApiResponse(responseCode = "400", description = "invalid input")
    })
    public String printName(@RequestParam String nome){
        return "Name: " + nome;
    }

    @PostMapping("/printNameReversed")
    @Operation(summary = "restituisce nome inserito invertito")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "valid input"),
            @ApiResponse(responseCode = "400", description = "invalid input")
    })
    public String printNameReversed(@RequestParam String nome){
        StringBuilder reverse = new StringBuilder(nome).reverse();
        return "Il nome al contrario è " + reverse.toString();
    }
}