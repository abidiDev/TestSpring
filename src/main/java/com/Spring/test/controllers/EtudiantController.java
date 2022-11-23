package com.Spring.test.controllers;

import com.Spring.test.entities.Etudiant;
import com.Spring.test.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("etudiant")
@RestController
@AllArgsConstructor
public class EtudiantController {

        IEtudiantService iEtudiantService;
        @GetMapping("/hello")
        public String sayHello(){
            return "hello";
        }
        @GetMapping("/getAll")
        public List<Etudiant> getAllEtudiants(){
            return  iEtudiantService.getAllEtudiants();
        }

        @PostMapping("/add")
        @ResponseBody
        public Etudiant addEtudiant(@RequestBody  Etudiant e){
            return iEtudiantService.addEtudiant(e);
        }
        @PutMapping("/update")
        @ResponseBody
        public Etudiant updateEtudiant(@RequestBody Etudiant E){
            return  iEtudiantService.updateEtudiant(E);
        }

        @DeleteMapping("/delete/{id}")
        public void getEtudiant(@PathVariable Integer id) {
            iEtudiantService.deleteEtudiant(id);
        }
        @GetMapping("get/{id}")
        public Etudiant getEtudiantById(@PathVariable Integer id){
            return iEtudiantService.getEtudiantById(id);
        }

    }
