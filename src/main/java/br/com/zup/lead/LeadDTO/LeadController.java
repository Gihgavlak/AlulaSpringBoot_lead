package br.com.zup.lead.LeadDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {
    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLead(@RequestBody LeadDTO leadDTO){
        leadService.salvarLead(leadDTO);

    }

    @GetMapping
    public List<LeadDTO>exibirListaDelead(){
        return leadService.retornarTodosOsLead();
    }

}
