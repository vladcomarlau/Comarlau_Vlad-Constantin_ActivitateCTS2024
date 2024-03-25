package org.example.sportiv.E5.entities.PlatformaB;

import org.example.sportiv.E5.repository.IBiletB;

public class PlatformaB {
    private IBiletB bilet;

    public void setBilet(IBiletB bilet) {
        this.bilet = bilet;
    }

    public void rezervaBiletPrinPlatforma() {
        this.bilet.rezervaPrinPlatforma();
    }

    public void cumparaBiletPrinPlatforma() {
        this.bilet.cumparaPrinPlatforma();
    }
}
