package com.Spring.test.services;

import com.Spring.test.entities.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
    public int getNbrRendezvousmedecin(Long IdMeecin);
}
