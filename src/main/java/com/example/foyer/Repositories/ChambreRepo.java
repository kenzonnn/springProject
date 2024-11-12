package com.example.foyer.Repositories;

import com.example.foyer.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepo extends JpaRepository<Chambre, Integer> {
}
