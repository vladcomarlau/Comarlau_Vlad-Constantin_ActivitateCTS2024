package org.example.sportiv.E8.entities;

import org.example.sportiv.E8.repository.IVanzareBilet;

public class ProxyVanzareBilet implements IVanzareBilet {
    private VanzareBilet vanzareBilet;

    public ProxyVanzareBilet(VanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vinde() {
        if(vanzareBilet.getVarstaClient() >= 14) {
            vanzareBilet.vinde();
        } else {
            System.out.println("Vanzare esuata: clientul nu are varsta minima de 14 ani!");
        }
    }
}
