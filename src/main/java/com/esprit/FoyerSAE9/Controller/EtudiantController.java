package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IEtudiantService;
import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Etudiant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    private final IEtudiantService iEtudiantService;

    public EtudiantController(IEtudiantService iEtudiantService) {
        this.iEtudiantService = iEtudiantService;
    }

    @PostMapping(path = "/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return iEtudiantService.addEtudiant(etudiant);
    }

    @PostMapping(path = "/editEtudiant")
    public Etudiant editEtudiant(@RequestBody Etudiant etudiant){
        return iEtudiantService.updateEtudiant(etudiant);
    }
    @GetMapping(path = "/listEtudiant")
    public List<Etudiant> etudiantList(){
        return iEtudiantService.getAllEtudiant();
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteEtudiant(@PathVariable Long id){
        iEtudiantService.deleteEtudiant(id
        );
    }
}
