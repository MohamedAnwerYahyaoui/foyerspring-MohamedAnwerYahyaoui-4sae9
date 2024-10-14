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

    @PostMapping(path = "/addUniversitie")
    public Universite addEtudiant(@RequestBody Universite universite){
        return iUniversiteService.addUniversite(universite);
    }

    @PostMapping(path = "/editUniversitie")
    public Universite editUniversitie(@RequestBody Universite universite){
        return iUniversiteService.updateUniversite(universite);
    }
    @GetMapping(path = "/listUniversitie")
    public List<Universite> UniversiteList(){
        return iUniversiteService.getAllUniversite();
    }

    @GetMapping(path = "/getUniversitie/{id}")
    public Universite getUniversitieById(@PathVariable Long id){
        return iUniversiteService.getUniversiteById(id);
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteUniversite(@PathVariable Long id){
        iUniversiteService.deletUniversite(id);

    }
}
