package com.example.foyer.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany
    private List<Etudiant> etudiants;
}
