package com.Spring.test.services;

import com.Spring.test.entities.Clinique;
import com.Spring.test.entities.Medecin;
import com.Spring.test.entities.RendezVous;
import com.Spring.test.repositories.ICleniqueRepository;
import com.Spring.test.repositories.IMedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class MedecinServiceImpl implements IMedecinService{
    IMedecinRepository medecinRepository;
    ICleniqueRepository cleniqueRepository;
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique=cleniqueRepository.findById(cliniqueId).orElse(null);
        List<Clinique>cliniques=medecin.getCliniques();
        cliniques.add(clinique);
        medecin.setCliniques(cliniques);
        return medecinRepository.save(medecin);

    }

    @Override
    public int getNbrRendezvousmedecin(Long IdMeecin) {

        return medecinRepository.findById(IdMeecin).orElse(null).getRendezVous().size();


    }
}
