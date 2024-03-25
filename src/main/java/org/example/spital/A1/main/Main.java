package org.example.spital.A1.main;

import org.example.spital.A1.entities.Pacient;
import org.example.spital.A1.entities.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder builderPacient1 = new PacientBuilder();
        Pacient pacient1 = builderPacient1.setHasHalatPentruExterior(true)
                .setHasPatRabatabil(true)
                .build();
        System.out.println(pacient1);

        PacientBuilder builderPacient2 = new PacientBuilder();
        Pacient pacient2 = builderPacient2.build();
        System.out.println(pacient2);

        PacientBuilder builderPacient3 = new PacientBuilder();
        Pacient pacient3 = builderPacient3
                .setHasMicDejunInclus(true)
                .setHasHalatPentruExterior(true)
                .setHasPatRabatabil(true)
                .setHasPapuciDeCamera(true).build();
        System.out.println(pacient3);
    }
}