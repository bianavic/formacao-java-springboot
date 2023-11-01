package org.edu.fabs.formacaojavaspringboot.singletonprototype.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    // instrucao de runner, de inicializacao do container ou do contexto springboot
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean // por ser um bean, o metodo run tb consegue injetar o outro componente, o ConversorJson
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
        };
    }

}
