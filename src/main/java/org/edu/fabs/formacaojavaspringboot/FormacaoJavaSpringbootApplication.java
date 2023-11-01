package org.edu.fabs.formacaojavaspringboot;

import org.edu.fabs.formacaojavaspringboot.app.ConversorJson;
import org.edu.fabs.formacaojavaspringboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FormacaoJavaSpringbootApplication {

    // instrucao de runner, de inicializacao do container ou do contexto springboot
    public static void main(String[] args) {
        SpringApplication.run(FormacaoJavaSpringbootApplication.class, args);

        // o nao uso de NEW é aspecto de beans e comandos de inicializacao
        // nao crie instancia (new) qdo o springboot prove esses mecanismos

        // apos o contexto ser inicializado, podemos usar


        // os objetos abaixo nao estao disponiveis dentro do contexto springboot
        // conforme convencoes de IoC e DI
//		Calculadora calculadora = new Calculadora();
//		System.out.println("o resultado é " + calculadora.soma(2, 7));
    }

    @Bean // por ser um bean, o metodo run tb consegue injetar o outro componente, o ConversorJson
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-00\", \"logradouro\": \"Praca Se\", \"localidade\": SP}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("dados do CEP: " + response);
        };
    }

    ;

}
