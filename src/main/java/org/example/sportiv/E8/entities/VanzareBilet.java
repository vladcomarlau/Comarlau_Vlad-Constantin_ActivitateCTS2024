package org.example.sportiv.E8.entities;

import org.example.sportiv.E8.repository.IVanzareBilet;

public class VanzareBilet implements IVanzareBilet {
    private int varstaClient;
    private Bilet bilet;

    public VanzareBilet(Bilet bilet, int varstaClient) {
        this.varstaClient = varstaClient;
        this.bilet = bilet;
    }

    public int getVarstaClient() {
        return varstaClient;
    }

    @Override
    public void vinde() {
        bilet.setVandut(true);
        System.out.println("Vanzare efectuata cu succes!");
    }
}
