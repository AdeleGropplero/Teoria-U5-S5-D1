package com.example.demo.Lombok;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data --> contiente ToSTring, getter, settere, hashCode ed equals, quindi non serve scriverli prima.
public class User_Lombok {
    private String name;
    private String lastName;
}

//Tramite le annotation abbiamo già generato tutto, quindi non serve scrivere i vari metodi.
