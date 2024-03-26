package org.example.banca.D9.entities;

import org.example.banca.D9.repository.IFiliala;

public class Filiala implements IFiliala {
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void stergeNod(IFiliala filiala) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void adaugaNod(IFiliala filiala) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public IFiliala getNod(int index) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void descriere(int level) {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        System.out.println(tab + nume);
    }
}
