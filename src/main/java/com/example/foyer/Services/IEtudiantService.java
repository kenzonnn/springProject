package com.example.foyer.Services;


import com.example.foyer.entities.Etudiant;


import java.util.Date;
import java.util.List;


public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant getEtudiantById(int idEtudiant);

    Etudiant updateEtudiant(Etudiant etudiant);

    void deleteEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiant();

    Etudiant getEtudiantByCin(int cin);

    List<Etudiant> getEtudiantByDateNaissanceGreaterThan(Date dateNaiss);

    List<Etudiant> repererAllByDateNAfter(Date dateNaiss );
}