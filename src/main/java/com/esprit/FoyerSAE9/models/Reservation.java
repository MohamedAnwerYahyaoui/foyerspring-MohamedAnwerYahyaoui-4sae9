package com.esprit.FoyerSAE9.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private Long idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToMany
    private List<Etudiant> etudiants;

}
