package br.com.zup.lead.LeadDTO;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<LeadDTO> listaDeLead = new ArrayList<>();

    public void salvarLead (LeadDTO leadDTO){
        listaDeLead.add(leadDTO);
    }

    public List<LeadDTO> retornarTodosOsLead(){
        return listaDeLead;
    }

    public void validarEmail(LeadDTO leadDTO){
        for (LeadDTO referencia: listaDeLead) {
            if (referencia.getEmail().equalsIgnoreCase(leadDTO.getEmail())){
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
            }
        }
        listaDeLead.add(leadDTO);

    }

}
