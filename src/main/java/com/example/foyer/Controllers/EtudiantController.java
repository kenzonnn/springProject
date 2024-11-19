package com.example.foyer.Controllers;


import com.example.foyer.Services.IEtudiantService;
import com.example.foyer.entities.Etudiant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("api/etudiants")
@Tag(name = "Gestion Étudiant", description = "API for managing Étudiants")
public class EtudiantController {

    IEtudiantService etudiantService;

    @PostMapping()
    @Operation(summary = "Add a new Étudiant", description = "Creates a new Étudiant and returns the created object.")
    public Etudiant ajoutEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("{idEtudiant}")
    @Operation(summary = "Get Étudiant by ID", description = "Retrieves an Étudiant by its ID.")
    public Etudiant getEtudiant(@PathVariable("idEtudiant") int idEtudiant) {
        return etudiantService.getEtudiantById(idEtudiant);
    }

    @DeleteMapping()
    @Operation(summary = "Delete an Étudiant", description = "Deletes an Étudiant based on the provided Étudiant object.")
    public void deleteEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.deleteEtudiant(etudiant);
    }

    @PutMapping()
    @Operation(summary = "Update an Étudiant", description = "Updates an existing Étudiant and returns the updated object.")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping()
    @Operation(summary = "Get all Étudiants", description = "Retrieves a list of all Étudiants.")
    public List<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiant();
    }


    @GetMapping("/cin/{cin}")
    @Operation(summary = "Get Étudiant by CIN", description = "Retrieves an Étudiant by its CIN.")
    public Etudiant getEtudiantByCin(@PathVariable("cin") int cin) {
        return etudiantService.getEtudiantByCin(cin);
    }

    @GetMapping("recupererAllByDateNaissanceGreaterThan/{dateN}")
    public List<Etudiant> recupererByDateNaissanceGreaterThan(@PathVariable("dateN") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateN) {
        return etudiantService.getEtudiantByDateNaissanceGreaterThan(dateN);
    }

    @GetMapping("recupererAllByDateNaissanceAfter/{dateN}")
    public List<Etudiant> repererAllByDateNAfter(@PathVariable("dateN") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateN) {
        return etudiantService.repererAllByDateNAfter(dateN);
    }
}
