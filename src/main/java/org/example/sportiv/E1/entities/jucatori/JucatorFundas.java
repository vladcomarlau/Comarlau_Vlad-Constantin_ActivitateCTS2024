package org.example.sportiv.E1.entities.jucatori;

import org.example.sportiv.E1.repository.IJucator;

public class JucatorFundas implements IJucator {
    @Override
    public void afisareTip() {
        System.out.println("Sunt fundas!");
    }
}
