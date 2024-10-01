package com.example.foyer.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne
    private Foyer foyer;
}
