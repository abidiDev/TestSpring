package com.Spring.test.repositories;

import com.Spring.test.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedecinRepository extends JpaRepository<Medecin,Long> {
}
