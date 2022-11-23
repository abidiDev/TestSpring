package com.Spring.test.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name ="Medecin")
public class Medecin  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMedecin")
    private long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Sprcialite specialite;
    private int telephone;
    private int prixConsultation;
    @ManyToMany(mappedBy = "medecins")
    private List<Clinique> cliniques;
    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous;

}

