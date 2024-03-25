package org.example.sportiv.E1.main;

import org.example.sportiv.E1.entities.factory.JucatorFactory;
import org.example.sportiv.E1.repository.ETipJucator;
import org.example.sportiv.E1.repository.IJucator;

public class Main {
    public static void main (String[] args) throws Exception {
        JucatorFactory factory = new JucatorFactory();
        IJucator atacant = factory.creareJucator(ETipJucator.ATACANT);
        atacant.afisareTip();

        IJucator portar = factory.creareJucator(ETipJucator.PORTAR);
        portar.afisareTip();

        IJucator fundas = factory.creareJucator(ETipJucator.FUNDAS);
        fundas.afisareTip();
    }
}
