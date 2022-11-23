package com.Spring.test.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name ="Patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMedecin")
    private long idPatient;
    private String nomPatient;
    private int telephone;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous;

}
