package com.esprit.FoyerSAE9.Services.ServiceImpl;

import com.esprit.FoyerSAE9.Repository.FoyerRepository;
import com.esprit.FoyerSAE9.Services.IFoyerService;
import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Foyer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFoyerServiceImpl implements IFoyerService {

    private final FoyerRepository foyerRepository;

    public IFoyerServiceImpl(FoyerRepository foyerRepository) {
        this.foyerRepository = foyerRepository;
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deletFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(Long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
