package org.edu.fabs.formacaojavaspringboot.iocdibeansautowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {SpringApplication.run(Main.class, args);}

    @Bean // por ser um bean, o metodo run tb consegue injetar o outro componente, o ConversorJson
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-00\", \"logradouro\": \"Praca Se\", \"localidade\": SP}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("dados do CEP: " + response);
        };
    }

}
