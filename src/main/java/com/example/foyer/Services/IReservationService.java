package com.example.foyer.Services;

import com.example.foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    Reservation getReservationById(String idReservation);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);

    List<Reservation> getAllReservation();

    Reservation affecterEtudiantToReservation( String idREservation, int idEtudiant);
}