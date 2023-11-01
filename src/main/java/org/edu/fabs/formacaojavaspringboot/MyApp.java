package org.edu.fabs.formacaojavaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    // o container, qdo inicializado, percebeu que existe um componente calculadora,
    // e o componente MyApp precisou do componente autowired realizar essa injecao de dependencia
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é " + calculadora.soma(2, 7));
    }

}
