package org.example.STB.F13.main;

import org.example.STB.F13.entities.Autobuz;
import org.example.STB.F13.entities.ManagerMemento;

public class Main {
    public static void main(String[] args) throws Exception {
        ManagerMemento managerMemento = new ManagerMemento();
        Autobuz autobuz = new Autobuz("Gigel",23.2f,"X", 2024, 30);
        System.out.println(autobuz);

        managerMemento.adaugaMemento(autobuz.salvareMemento());
        autobuz.setSofer("Marcel");
        autobuz.setConsumMediu(19.8f);
        managerMemento.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz);

        autobuz.setSofer("Stefan");
        autobuz.setConsumMediu(27.4f);
        managerMemento.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz);

        autobuz.undoToMemento(managerMemento.getMemento(1));
        System.out.println(autobuz);

        autobuz.undoToMemento(managerMemento.getLastMemento());
        System.out.println(autobuz);
    }
}
