package com.example.foyer.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bloc {

    @Id
    @GeneratedValue
    int idBloc;
    String nomBloc;
    int capaciteBloc;
}
