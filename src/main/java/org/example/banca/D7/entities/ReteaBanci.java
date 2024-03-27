package org.example.banca.D7.entities;

import java.util.ArrayList;
import java.util.List;

public class ReteaBanci {
    private List<Integer> listaClientiCuCreante;

    public ReteaBanci() {
        this.listaClientiCuCreante = new ArrayList<>();
        this.listaClientiCuCreante.add(123456789);
        this.listaClientiCuCreante.add(123123123);
    }

    public boolean areCreante(int cnp) {
        return this.listaClientiCuCreante.contains(cnp);
    }
}
