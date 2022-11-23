package com.Spring.test.services;

import com.Spring.test.entities.Patient;
import com.Spring.test.repositories.IPatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientserviceImpl implements IPatientService{
    IPatientRepository iPatientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return iPatientRepository.save(patient);
    }
}
