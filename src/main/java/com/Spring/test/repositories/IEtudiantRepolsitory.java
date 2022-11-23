package com.Spring.test.repositories;

import com.Spring.test.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtudiantRepolsitory extends JpaRepository<Etudiant,Integer> {
}
