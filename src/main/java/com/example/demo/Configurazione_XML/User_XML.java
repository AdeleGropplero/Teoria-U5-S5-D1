package com.example.demo.Configurazione_XML;

public class User_XML {
    private String name;
    private String lastName;

    public User_XML(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User_XML() {
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
        return "User_XML{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
