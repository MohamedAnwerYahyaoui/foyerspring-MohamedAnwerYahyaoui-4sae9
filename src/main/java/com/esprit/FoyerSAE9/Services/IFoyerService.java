package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    void deletFoyer(Long idFoyer);
    List<Foyer> getAllFoyer();
    Foyer updateFoyer(Foyer foyer);
}
