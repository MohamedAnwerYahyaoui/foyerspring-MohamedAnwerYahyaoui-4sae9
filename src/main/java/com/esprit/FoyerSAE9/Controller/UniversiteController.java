package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IUniversiteService;
import com.esprit.FoyerSAE9.models.Reservation;
import com.esprit.FoyerSAE9.models.Universite;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universitie")
public class UniversiteController {

    private final IUniversiteService iUniversiteService;

    public UniversiteController(IUniversiteService iUniversiteService) {
        this.iUniversiteService = iUniversiteService;
    }

    @PostMapping(path = "/addReservation")
    public Universite addEtudiant(@RequestBody Universite universite){
        return iUniversiteService.addUniversite(universite);
    }

    @PostMapping(path = "/editReservation")
    public Universite editEtudiant(@RequestBody Universite universite){
        return iUniversiteService.updateUniversite(universite);
    }
    @GetMapping(path = "/listReservation")
    public List<Universite> UniversiteList(){
        return iUniversiteService.getAllUniversite();
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteUniversite(@PathVariable Long id){
        iUniversiteService.deletUniversite(id);

    }
}
