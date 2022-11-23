package com.Spring.test.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="RendezVous")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"attributeOfTypeList", "attributeOfTypeSet"})

public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idRDV;
    @Temporal (TemporalType.DATE)

    private Date dateRDV;
    private String remarque;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;
}
