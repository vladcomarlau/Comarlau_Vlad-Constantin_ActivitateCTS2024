package org.example.companiaSTB.F7.main;

import org.example.companiaSTB.F7.entities.Bilet;
import org.example.companiaSTB.F7.entities.BiletDecorat;
import org.example.companiaSTB.F7.entities.Decorator;

public class Main {
    public static void main (String[] args) {
        Bilet bilet = new Bilet();
        bilet.printeazaMesaj();

        Decorator biletDecorat = new BiletDecorat(bilet);

        biletDecorat.adaugaAnuntReducere();
        biletDecorat.printeazaMesaj();
    }
}
