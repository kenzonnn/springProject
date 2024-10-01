package com.example.foyer.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idBloc;
    String nomBloc;
    int capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "bloc")
    private Set<Chambre> chambre;
}
