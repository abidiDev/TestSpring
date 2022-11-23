package com.Spring.test.services;

import com.Spring.test.entities.Medecin;
import com.Spring.test.entities.Patient;
import com.Spring.test.entities.RendezVous;
import com.Spring.test.entities.Sprcialite;
import com.Spring.test.repositories.IMedecinRepository;
import com.Spring.test.repositories.IPatientRepository;
import com.Spring.test.repositories.IRendezVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Rendez_vousServiceImpl implements IRendez_vousService{
    IRendezVousRepository iRendezVousRepository;
    IMedecinRepository iMedecinRepository;
    IPatientRepository iPatientRepository;
    @Override
    public void addRDVAssignMedAndPatient(RendezVous rendezVous, Long idMedecin, Long idPatient) {
        Medecin medecin=iMedecinRepository.findById(idMedecin).orElse(null);
        Patient patient=iPatientRepository.findById(idPatient).orElse(null);
        rendezVous.setPatient(patient);
        rendezVous.setMedecin(medecin);
        iRendezVousRepository.save(rendezVous);

    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndspecialite(long idClinique, Sprcialite specialite) {
        return null;
    }
}
