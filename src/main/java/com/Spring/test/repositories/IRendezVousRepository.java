package com.Spring.test.repositories;

import com.Spring.test.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IRendezVousRepository extends JpaRepository<RendezVous,Long> {

}
