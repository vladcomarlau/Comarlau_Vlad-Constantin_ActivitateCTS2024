package org.example.sportiv.E1.entities.jucatori;

import org.example.sportiv.E1.repository.IJucator;

public class JucatorAtacant implements IJucator {
    @Override
    public void afisareTip() {
        System.out.println("Sunt atacant!");
    }
}
