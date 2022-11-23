package com.Spring.test.controllers;

import com.Spring.test.entities.Clinique;
import com.Spring.test.entities.Etudiant;
import com.Spring.test.services.ICliniqueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("clinique")
@RestController
@AllArgsConstructor
public class CliniqueController {
    ICliniqueService iCliniqueService;

    @PostMapping("/add")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique clinique){
        return iCliniqueService.addClinique(clinique);
    }
}
