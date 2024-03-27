package org.example.STB.F13.entities;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<MementoAutobuz> listaAutobuze = new ArrayList<>();

    public void adaugaMemento(MementoAutobuz memento) {
        listaAutobuze.add(memento);
    }

    public MementoAutobuz getMemento(int index) {
        return listaAutobuze.get(index);
    }

    public MementoAutobuz getLastMemento() throws Exception {
        if(listaAutobuze.size() != 0) {
            MementoAutobuz memento = listaAutobuze.get(listaAutobuze.size()-1);
            listaAutobuze.remove(listaAutobuze.size()-1);
            return memento;
        } else {
            throw new Exception("Nu exista stari salvate");
        }
    }
}
