package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IFoyerService;
import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Foyer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {

    private final IFoyerService iFoyerService;

    public FoyerController(IFoyerService iFoyerService) {
        this.iFoyerService = iFoyerService;
    }

    @PostMapping(path = "/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer){
        return iFoyerService.addFoyer(foyer);
    }

    @PostMapping(path = "/editFoyer")
    public Foyer editFoyer(@RequestBody Foyer foyer){
        return iFoyerService.updateFoyer(foyer);
    }
    @GetMapping(path = "/listFoyer")
    public List<Foyer> FoyerList(){
        return iFoyerService.getAllFoyer();
    }
    @GetMapping(path = "/FoyerById/{id}")
    public Foyer getFoyerById(@PathVariable Long id){
        return iFoyerService.getFoyerById(id);
    }
    @DeleteMapping(path = "/deleteBy/{id}")
    public void deleteFoyer(@PathVariable Long id){
        iFoyerService.deletFoyer(id);
    }
}
