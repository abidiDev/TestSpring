package com.Spring.test.services;

import com.Spring.test.entities.Clinique;
import com.Spring.test.repositories.ICleniqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CliniqueServiecImpl implements ICliniqueService{
    ICleniqueRepository iCleniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return iCleniqueRepository.save(clinique);
    }
}
