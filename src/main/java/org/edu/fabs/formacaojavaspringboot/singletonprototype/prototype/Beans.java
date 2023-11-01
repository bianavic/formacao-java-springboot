package org.edu.fabs.formacaojavaspringboot.singletonprototype.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    // preciso dizer que esse BEAN é do escopo PROTOTYPE pois
    // -> cada execucao, cada referencia, tera um objeto pertinente

    @Bean // o bean remetente irei criar uma vez, sucessivamente
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }

}
