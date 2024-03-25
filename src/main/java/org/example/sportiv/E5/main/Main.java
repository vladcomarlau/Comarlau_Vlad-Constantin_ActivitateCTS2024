package org.example.sportiv.E5.main;

import org.example.sportiv.E5.entities.PlatformaB.BiletAdaptatB;
import org.example.sportiv.E5.entities.PlatformaB.BiletB;
import org.example.sportiv.E5.entities.PlatformaB.PlatformaB;
import org.example.sportiv.E5.repository.IBiletB;

public class Main {
    public static void main (String[] args) {
        PlatformaB platformaB = new PlatformaB();

        IBiletB biletB = new BiletB();
        platformaB.setBilet(biletB);
        platformaB.rezervaBiletPrinPlatforma();
        platformaB.cumparaBiletPrinPlatforma();
        System.out.println(biletB);

        IBiletB biletAdaptatB = new BiletAdaptatB();
        platformaB.setBilet(biletAdaptatB);
        platformaB.cumparaBiletPrinPlatforma();
        platformaB.rezervaBiletPrinPlatforma();
        System.out.println(biletAdaptatB);
    }
}
