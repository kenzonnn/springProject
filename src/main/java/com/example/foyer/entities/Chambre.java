package com.example.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

@Entity
@Getter
@Setter
public class Chambre {

    @Id
    @GeneratedValue
    int idChambre;

    int nombreChambre;

    TypeChambre typeC;
}
