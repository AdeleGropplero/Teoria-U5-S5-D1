package com.example.demo;

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


        //METODO TRE ---------------------------------------------------
        //Config. tramite component
    }

    public static void config_XML(){
        //Creo un Container (Context), dove gestire il ciclo di vita di Bean (oggetto) tramite Spring.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        User_XML u = (User_XML) applicationContext.getBean("user_XML"); //facciamo il cast,
        // perchè per java di default è un Object ma noi sappiamo che è di tipo user
        // quindi ci prendiamo la responsabilità del cast.
        System.out.println(u);

        applicationContext.close(); //Buona norma chiudere.
    }

    public static void config_Class(){
       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    }

}
