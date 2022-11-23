package com.Spring.test.services;

import com.Spring.test.entities.RendezVous;
import com.Spring.test.entities.Sprcialite;

import java.util.List;

public interface IRendez_vousService {
    public void addRDVAssignMedAndPatient(RendezVous rendezVous, Long idMedecin, Long idPatient);
    public List<RendezVous>getRendezVousByCliniqueAndspecialite(long idClinique, Sprcialite specialite);
}
