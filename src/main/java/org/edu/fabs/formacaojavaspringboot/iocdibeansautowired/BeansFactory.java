package org.edu.fabs.formacaojavaspringboot.iocdibeansautowired;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;

// @Configuration
public class BeansFactory {

    // todos meus beans, classes externas que precisarao ser gerenciados pelo spring
    // estarao disponiveis neste arquivo
    @Bean
    public Gson gson() {
        return new Gson();
    }

}
