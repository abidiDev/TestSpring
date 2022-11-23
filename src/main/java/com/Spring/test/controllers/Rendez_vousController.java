package com.Spring.test.controllers;

import com.Spring.test.entities.RendezVous;
import com.Spring.test.services.IRendez_vousService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("rendez_vous")
@RestController
@AllArgsConstructor
public class Rendez_vousController {
    IRendez_vousService iRendez_vousService;
    @PostMapping("/addRDVAssignMedAndPatient/{idMedecin}/{idPatient}")
    @ResponseBody
    public void addRDVAssignMedAndPatient(@RequestBody RendezVous rendezVous,@PathVariable Long idMedecin,@PathVariable Long idPatient) {
        iRendez_vousService.addRDVAssignMedAndPatient(rendezVous,idMedecin,idPatient);
    }

    }
