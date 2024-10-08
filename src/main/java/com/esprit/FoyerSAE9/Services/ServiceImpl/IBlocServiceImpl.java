package com.esprit.FoyerSAE9.Services.ServiceImpl;

import com.esprit.FoyerSAE9.Repository.BlocRepository;
import com.esprit.FoyerSAE9.Services.IBlocService;
import com.esprit.FoyerSAE9.models.Bloc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBlocServiceImpl implements IBlocService {

    private final BlocRepository blocRepository;

    public IBlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deletBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
