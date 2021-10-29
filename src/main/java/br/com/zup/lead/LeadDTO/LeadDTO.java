package br.com.zup.lead.LeadDTO;

import java.util.ArrayList;
import java.util.List;

public class LeadDTO {
    private String nome;
    private String email;
    private String telefone;
    private List<ProdutoDTO> produtos = new ArrayList<>();

    public LeadDTO() {
    }

    public LeadDTO(String nome, String email, String telefone, List<ProdutoDTO> produtos) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
