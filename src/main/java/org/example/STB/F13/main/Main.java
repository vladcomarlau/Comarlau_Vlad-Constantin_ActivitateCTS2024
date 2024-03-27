package org.example.STB.F13.main;

import org.example.STB.F13.entities.Autobuz;
import org.example.STB.F13.entities.ManagerAutobuze;

public class Main {
    public static void main(String[] args) {
        ManagerAutobuze managerAutobuze = new ManagerAutobuze();
        Autobuz autobuz = new Autobuz("Gigel",23.2f,"X", 2024, 30);
        System.out.println(autobuz);

        managerAutobuze.adaugaMemento(autobuz.salvareMemento());
        autobuz.setSofer("Marcel");
        autobuz.setConsumMediu(19.8f);
        managerAutobuze.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz);

        autobuz.setSofer("Stefan");
        autobuz.setConsumMediu(27.4f);
        managerAutobuze.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz);

        try {
            autobuz.undoToMemento(managerAutobuze.getMemento(1));
            System.out.println(autobuz);

            autobuz.undoToMemento(managerAutobuze.getLastMemento());
            System.out.println(autobuz);
        } catch (Exception e){

        }
    }
}
