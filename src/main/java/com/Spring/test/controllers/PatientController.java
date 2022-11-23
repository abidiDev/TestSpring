package com.Spring.test.controllers;

import com.Spring.test.entities.Clinique;
import com.Spring.test.entities.Patient;
import com.Spring.test.services.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("patient")
@RestController
@AllArgsConstructor
public class PatientController {
    IPatientService iPatientService;
    @PostMapping("/add")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient patient){
        return iPatientService.addPatient(patient);
    }
}
