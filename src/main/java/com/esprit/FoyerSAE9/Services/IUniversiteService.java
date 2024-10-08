package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    void deletUniversite(Long idUniversite);
    List<Universite> getAllUniversite();
    Universite updateUniversite(Universite universite);
}
