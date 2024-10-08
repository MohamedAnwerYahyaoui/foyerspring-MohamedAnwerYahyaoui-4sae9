package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    void deletChambre(Long idChambre);
    List<Chambre> getAllChambre();
    Chambre updateChambre(Chambre chambre);
}
