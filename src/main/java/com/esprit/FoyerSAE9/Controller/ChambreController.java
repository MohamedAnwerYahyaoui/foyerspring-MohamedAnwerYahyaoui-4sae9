package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IChambreService;
import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Chambre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    private final IChambreService iChambreService;

    public ChambreController(IChambreService iChambreService) {
        this.iChambreService = iChambreService;
    }

    @PostMapping(path = "/addChambre")
    public Chambre addBloc(@RequestBody Chambre chambre){
        return iChambreService.addChambre(chambre);
    }

    @PostMapping(path = "/editChambre")
    public Chambre editBloc(@RequestBody Chambre chambre){
        return iChambreService.updateChambre(chambre);
    }
    @GetMapping(path = "/listChambre")
    public List<Chambre> chambreList(){
        return iChambreService.getAllChambre();
    }

    @GetMapping(path = "/chambreById/{id}")
    public Chambre getChambreById(@PathVariable Long id){
        return iChambreService.getChambreById(id);
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteChambre(@PathVariable Long id){
        iChambreService.deletChambre(id);
    }
}
