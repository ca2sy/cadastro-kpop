package dev.ca2sy.CadastroDeKpop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class KIdolController {


    @GetMapping("/boasvindas")
    public String boasVindas(){
        return ("Primeira mensagem nesse portal");
    }
    
}
