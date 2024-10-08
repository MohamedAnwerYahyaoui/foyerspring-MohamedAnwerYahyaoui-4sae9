package com.esprit.FoyerSAE9.Services;

import com.esprit.FoyerSAE9.models.Bloc;
import com.esprit.FoyerSAE9.models.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    void deletBloc(Long idBloc);
    List<Bloc> getAllBloc();
    Bloc updateBloc(Bloc bloc);
}
