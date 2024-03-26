package org.example.companiaSTB.F7.entities;

import org.example.companiaSTB.F7.repository.IBilet;

import java.time.LocalDate;

public class Bilet implements IBilet {
    private String mesaj = "STB va ureaza calatorie placuta!";
    private LocalDate dataCurenta = LocalDate.of(2024, 1, 1);

    public LocalDate getDataCurenta() {
        return dataCurenta;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    @Override
    public void printeazaMesaj() {
        System.out.println(this.mesaj + "\nData: " + dataCurenta);
    }
}
