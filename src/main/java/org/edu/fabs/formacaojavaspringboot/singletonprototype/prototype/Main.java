package org.edu.fabs.formacaojavaspringboot.singletonprototype.prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    // qdo um unico objeto sendo referenciado e dentro da aplicacao esta sofrendo alteracoes
    // reflentindo em outra referencia -> 2 variaveis apontando para a mesma referencia

    // preciso dizer que esse BEAN é do escopo PROTOTYPE -> cada execucao, cada referencia tera um objeto pertinente

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }

}
