package com.example.demo.Configurazione_Classe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Annotazione necessaria per comunicare che è una classe di configurazione di beans.
public class ConfigurationBean {
    //Qui mi creerò dei metodi per istanziare i miei beans

    @Bean //Qui uso l'annotazione Bean per indicare a java di che cosa si tratta.
    public User_Class user() {
        return new User_Class("Maria", "Bianchi");
    }

    //Torno nel main a crearmi un metodo.
}
