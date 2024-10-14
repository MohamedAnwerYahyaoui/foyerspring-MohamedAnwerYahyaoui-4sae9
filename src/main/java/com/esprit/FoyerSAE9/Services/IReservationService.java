package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    void deletReservation(Long idReservation);
    List<Reservation> getAllReservation();
    Reservation getReservationById(Long id);
    Reservation updateReservation(Reservation reservation);
}
