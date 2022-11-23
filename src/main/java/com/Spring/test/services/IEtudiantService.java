package com.Spring.test.services;

import com.Spring.test.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> getAllEtudiants();
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudiant(Etudiant e);
    public void deleteEtudiant(Integer id);
    public Etudiant getEtudiantById(Integer id);
}
