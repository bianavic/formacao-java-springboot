package org.edu.fabs.formacaojavaspringboot.primeirospassos;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

}
