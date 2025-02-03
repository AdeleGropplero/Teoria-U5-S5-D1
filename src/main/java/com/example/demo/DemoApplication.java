package com.example.demo;

import com.example.demo.Configurazione_Classe.ConfigurationBean;
import com.example.demo.Configurazione_Classe.User_Class;
import com.example.demo.Configurazione_Component.User_component;
import com.example.demo.Configurazione_XML.User_XML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println("Run Forrest, Run!");

        //METODO UNO ---------------------------------------------------
        //Config. tramite file XML
        config_XML();

        //METODO DUE ---------------------------------------------------
        //Configurazione tramite classe
        config_Class();

        //METODO TRE ---------------------------------------------------
        //Config. tramite component
        config_Component();
    }

    public static void config_XML() {
        //Creo un Container (Context), dove gestire il ciclo di vita di Bean (oggetto) tramite Spring.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        User_XML u = (User_XML) applicationContext.getBean("user_XML"); //facciamo il cast,
        // Perchè per java di default è un Object ma noi sappiamo che è di tipo user
        // quindi ci prendiamo la responsabilità del cast.
        System.out.println(u);

        applicationContext.close(); //Buona norma chiudere.

        // Meno veloce e performante, non puoi gestire la logica ma è molto leggibile
        // per programmatori non java o altri colleghi non dev.
        // Migliore quando deve interagire con altri linguaggi.
    }

    public static void config_Class() {
        //Creo anche qui un container dove gestire il ciclo di vita di Bean (oggetto) tramite Spring.
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);

        //Per stampare lo spazio di memoria, togliere l'override del toString oppure usa:
        //System.out.println("Memory address of u1: " + System.identityHashCode(u1));

        // Recupero il Bean senza parametri tramite la classe ConfigurationBean
        User_Class u1 = (User_Class) applicationContext.getBean("user");
        System.out.println(u1);

        User_Class u2 = (User_Class) applicationContext.getBean("userParam", "Marco", "Verdi");
        System.out.println(u2);

        // Chiudo il container
        applicationContext.close();

        // Medio veloce ma ottimo se devi gestire la logica.
        // Probabilmente il più utilizzato.
    }

    public static void config_Component() {
        // Creo anche qui un container dove gestire il ciclo di vita di Bean (oggetto) tramite Spring.
        // Questa volta non passo ne la classe (che non esiste), ne la location del file xml.
        // Non passo nulla ma:
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // Devo dargli indicazione di dove cercare il @Compontent
        applicationContext.scan("com.example.demo.Configurazione_Component");
        applicationContext.refresh();

        User_component u1 = (User_component) applicationContext.getBean("UserComponent");
        u1.setName("Adele");
        u1.setLastName("LaBella");
        System.out.println(u1);

        User_component u2 = (User_component) applicationContext.getBean("UserComponent", "Chiara", "LaPiuBella");
        System.out.println(u2);

        // Chiudo il container
        applicationContext.close();

        // Più veloce ma non puoi gestire controlli

    }


}
