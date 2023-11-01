package org.edu.fabs.formacaojavaspringboot.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    // instrucao de runner, de inicializacao do container ou do contexto springboot
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        // o nao uso de NEW é aspecto de beans e comandos de inicializacao
        // nao crie instancia (new) qdo o springboot prove esses mecanismos

        // apos o contexto ser inicializado, podemos usar


        // os objetos abaixo nao estao disponiveis dentro do contexto springboot
        // conforme convencoes de IoC e DI
//		Calculadora calculadora = new Calculadora();
//		System.out.println("o resultado é " + calculadora.soma(2, 7));
    }

}
