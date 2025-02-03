package com.example.demo.Configurazione_Classe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //Annotazione necessaria per comunicare che è una classe di configurazione di beans.
public class ConfigurationBean {
    //Qui mi creerò dei metodi per istanziare i miei beans

    @Bean //Qui uso l'annotazione Bean per indicare a java di che cosa si tratta.
    @Scope("singleton") //questo è il default, ma se istanziamo più di un bean è necessario chiamarli come Prototype.
    public User_Class user() {
        return new User_Class("Maria", "Bianchi");
    }
    //Torno nel main a crearmi un metodo.

    @Bean
    @Scope("prototype")
    public User_Class userParam(String name, String lastName) {
        return new User_Class(name, lastName);
    }
    //Per passare poi nel main i dati che desideriamo.
}
