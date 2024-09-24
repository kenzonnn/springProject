package com.example.foyer.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Etudiant {

    @Id
    @GeneratedValue
    int idEtudiant;
    String nom;
    String prenom;
    int cin;
    String ecole;
    Date dateNaissance;
}
