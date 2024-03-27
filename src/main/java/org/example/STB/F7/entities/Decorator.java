package org.example.STB.F7.entities;

import org.example.STB.F7.repository.IBilet;

import java.time.LocalDate;

public abstract class Decorator implements IBilet {
    protected Bilet bilet;

    public Decorator (Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaMesaj() {
        if(this.bilet.getDataCurenta()
                .equals(LocalDate.of(2025, 1, 1))) {
            this.bilet.setMesaj(this.bilet.getMesaj()
                    + "\nLa multi ani! "
                    + "STB va ureaza calatorie placuta!\nData:"
                    + this.bilet.getDataCurenta());
        } else {
            this.bilet.setMesaj(this.bilet.getMesaj()
                    + "\nLa multi ani! "
                    + "STB va ureaza calatorie placuta!\nData: "
                    + this.bilet.getDataCurenta());
        }
        System.out.println(this.bilet.getMesaj());
    }

    public abstract void adaugaAnuntReducere();
}
