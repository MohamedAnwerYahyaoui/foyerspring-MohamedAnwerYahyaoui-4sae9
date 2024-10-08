package com.esprit.FoyerSAE9.Repository;

import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
