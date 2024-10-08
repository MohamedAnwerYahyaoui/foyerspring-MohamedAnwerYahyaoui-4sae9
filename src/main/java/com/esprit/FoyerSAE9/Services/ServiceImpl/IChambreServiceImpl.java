package com.esprit.FoyerSAE9.Services.ServiceImpl;

import com.esprit.FoyerSAE9.Repository.ChambreRepository;
import com.esprit.FoyerSAE9.Services.IChambreService;
import com.esprit.FoyerSAE9.models.Chambre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IChambreServiceImpl implements IChambreService {
    private final ChambreRepository chambreRepository;

    public IChambreServiceImpl(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deletChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
