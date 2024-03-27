package org.example.banca.D7.entities;

import java.util.ArrayList;
import java.util.List;

public class Politie {
    private List<Integer> listaOameniCautati;

    public Politie() {
        this.listaOameniCautati = new ArrayList<>();
        this.listaOameniCautati.add(123456789);
    }

    public boolean esteCautat(int cnp) {
        return this.listaOameniCautati.contains(cnp);
    }
}
