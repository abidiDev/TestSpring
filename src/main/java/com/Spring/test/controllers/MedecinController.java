package com.Spring.test.controllers;

import com.Spring.test.entities.Clinique;
import com.Spring.test.entities.Medecin;
import com.Spring.test.services.IMedecinService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("medecin")
@RestController
@AllArgsConstructor
public class MedecinController {
    IMedecinService iMedecinService;
    @PostMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    @ResponseBody
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable Long cliniqueId){
        return iMedecinService.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }
@GetMapping("getNbrRendezvousmedecin/{IdMeecin}")
    public int getNbrRendezvousmedecin(@PathVariable Long IdMeecin) {
        return  iMedecinService.getNbrRendezvousmedecin(IdMeecin);
    }
    }
