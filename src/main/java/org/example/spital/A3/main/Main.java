package org.example.spital.A3.main;

import org.example.spital.A3.entities.personalMedical.APersonalSpital;
import org.example.spital.A3.entities.factories.FactoryAsistent;
import org.example.spital.A3.entities.factories.FactoryBrancardier;
import org.example.spital.A3.entities.factories.FactoryMedic;
import org.example.spital.A3.repository.IFactory;

public class Main {
    public static void main(String[] args) {
        IFactory medicFactory = new FactoryMedic();
        APersonalSpital medic1 = medicFactory.crearePersonalSpital();
        medic1.afisareRol();
        APersonalSpital medic2 = medicFactory.crearePersonalSpital();
        System.out.println("medic1 == medic2: " + (medic1 == medic2));

        IFactory asistentFactory = new FactoryAsistent();
        APersonalSpital asistent1 = asistentFactory.crearePersonalSpital();
        asistent1.afisareRol();

        IFactory brancardierFactory = new FactoryBrancardier();
        APersonalSpital brancardier1 = brancardierFactory.crearePersonalSpital();
        brancardier1.afisareRol();
    }
}