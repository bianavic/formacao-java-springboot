package org.edu.fabs.formacaojavaspringboot.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration // associado a todo o sistema do application properties
@ConfigurationProperties(prefix = "remetente") // e todos os atributos sao pertinentes ao prefixo remetente
public class Remetente {

    private String nome;
    private String email;
    private List<Long> telefones;

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

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }

}
