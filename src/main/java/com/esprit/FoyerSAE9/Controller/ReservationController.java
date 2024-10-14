package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IReservationService;
import com.esprit.FoyerSAE9.models.Etudiant;
import com.esprit.FoyerSAE9.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService iReservationService;

    public ReservationController(IReservationService iReservationService) {
        this.iReservationService = iReservationService;
    }

    @PostMapping(path = "/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation){
        return iReservationService.addReservation(reservation);
    }

    @PostMapping(path = "/editReservation")
    public Reservation editReservation(@RequestBody Reservation reservation){
        return iReservationService.updateReservation(reservation);
    }
    @GetMapping(path = "/listReservation")
    public List<Reservation> reservationList(){
        return iReservationService.getAllReservation();
    }

    @GetMapping(path = "/getReservation/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return iReservationService.getReservationById(id);
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteReservation(@PathVariable Long id){
        iReservationService.deletReservation(id);

    }
}
