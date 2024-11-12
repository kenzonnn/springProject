package com.example.foyer.Services;

import com.example.foyer.entities.Chambre;
import java.util.List;


public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    Chambre getChambreById(int idChambre);

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Chambre chambre);

    List<Chambre> getAllChambre();

    void deleteChambreById(int idChambre);
}
