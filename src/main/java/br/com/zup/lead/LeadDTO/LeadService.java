package br.com.zup.lead.LeadDTO;

import org.springframework.stereotype.Service;

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
}
