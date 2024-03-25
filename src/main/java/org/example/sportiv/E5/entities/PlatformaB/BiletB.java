package org.example.sportiv.E5.entities.PlatformaB;

import org.example.sportiv.E5.repository.IBiletB;

//Pachet turistic (platforma noua)
public class BiletB implements IBiletB {
    private boolean rezervat = false;
    private boolean vandut = false;

    @Override
    public void rezervaPrinPlatforma() {
        this.rezervat = true;
    }

    @Override
    public void cumparaPrinPlatforma() {
        this.vandut = true;
    }

    @Override
    public String toString() {
        return "BiletB{" +
                "rezervat=" + rezervat +
                ", vandut=" + vandut +
                '}';
    }
}
