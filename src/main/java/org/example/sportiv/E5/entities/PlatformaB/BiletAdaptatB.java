package org.example.sportiv.E5.entities.PlatformaB;

import org.example.sportiv.E5.entities.PlatformaA.BiletA;
import org.example.sportiv.E5.repository.IBiletB;

public class BiletAdaptatB extends BiletA implements IBiletB {
    public BiletAdaptatB() {
        super();
    }

    @Override
    public void rezervaPrinPlatforma() {
        super.rezervaBilet();
    }

    @Override
    public void cumparaPrinPlatforma() {
        super.cumparaBilet();
    }

    @Override
    public String toString() {
        return "Bilet A adaptat B:\n " + super.toString();
    }
}
