package com.esprit.FoyerSAE9.Repository;

import com.esprit.FoyerSAE9.models.Chambre;
import com.esprit.FoyerSAE9.models.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
