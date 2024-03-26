package org.example.sportiv.E8.main;

import org.example.sportiv.E8.entities.Bilet;
import org.example.sportiv.E8.entities.ProxyVanzareBilet;
import org.example.sportiv.E8.entities.VanzareBilet;

public class Main {
    public static void main (String[] args) {
        Bilet bilet = new Bilet(1);
        VanzareBilet vanzareBilet = new VanzareBilet(bilet, 10);

        ProxyVanzareBilet proxyVanzareBilet = new ProxyVanzareBilet(vanzareBilet);
        proxyVanzareBilet.vinde();
        System.out.println(bilet);

        vanzareBilet.vinde();
        System.out.println(bilet);
    }
}
