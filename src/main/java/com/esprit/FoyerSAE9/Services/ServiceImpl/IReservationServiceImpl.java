package com.esprit.FoyerSAE9.Services.ServiceImpl;

import com.esprit.FoyerSAE9.Repository.ReservationRepository;
import com.esprit.FoyerSAE9.Services.IReservationService;
import com.esprit.FoyerSAE9.models.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    public IReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deletReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
