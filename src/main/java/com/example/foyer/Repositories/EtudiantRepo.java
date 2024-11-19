package com.example.foyer.Repositories;

import com.example.foyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {

    Etudiant findByCin(int cin);
    List<Etudiant> findAllByDateNaissanceGreaterThan(Date date);
    List<Etudiant> findAllByDateNaissanceAfter(Date date);
}
