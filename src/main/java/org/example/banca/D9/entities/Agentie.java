package org.example.banca.D9.entities;

import org.example.banca.D9.repository.IFiliala;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IFiliala {
    String nume;
    List<IFiliala> lista;

    public Agentie(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void stergeNod(IFiliala filiala) {
        lista.remove(filiala);
    }

    @Override
    public void adaugaNod(IFiliala filiala) {
        lista.add(filiala);
    }

    @Override
    public IFiliala getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere(int level) {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        level++;
        System.out.println(tab + nume);
        for(IFiliala filiala : lista) {
            filiala.descriere(level);
        }
    }
}
