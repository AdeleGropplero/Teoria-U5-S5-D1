package com.example.demo.Configurazione_Classe;

public class User_Class {

    private String name;
    private String lastName;

    public User_Class(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User_Class() {
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
        return "User_Class{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
