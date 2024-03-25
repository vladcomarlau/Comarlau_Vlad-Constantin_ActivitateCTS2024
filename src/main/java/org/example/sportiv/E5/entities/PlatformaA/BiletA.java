package org.example.sportiv.E5.entities.PlatformaA;

//masina (platforma veche)
public class BiletA {
    private boolean rezervat = false;
    private boolean vandut = false;

    public void rezervaBilet() {
        this.rezervat = true;
    }

    public void cumparaBilet() {
        this.vandut = true;
    }

    @Override
    public String toString() {
        return "BiletA{" +
                "rezervat=" + rezervat +
                ", vandut=" + vandut +
                '}';
    }
}
