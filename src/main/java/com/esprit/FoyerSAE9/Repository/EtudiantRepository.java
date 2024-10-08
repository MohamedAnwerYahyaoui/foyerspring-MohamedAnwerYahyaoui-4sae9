package com.esprit.FoyerSAE9.Repository;

import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
