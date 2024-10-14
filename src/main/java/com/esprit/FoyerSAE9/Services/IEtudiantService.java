package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> getAllEtudiant();
    Etudiant getEtudiantById(Long id);
    Etudiant updateEtudiant(Etudiant etudiant);
}
