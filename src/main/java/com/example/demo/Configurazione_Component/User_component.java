package com.example.demo.Configurazione_Component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("UserComponent")
@Scope("prototype")
public class User_component {

    private String name;
    private String lastName;

    public User_component(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User_component() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User_component{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
