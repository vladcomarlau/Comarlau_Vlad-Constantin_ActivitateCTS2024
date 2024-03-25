package org.example.sportiv.E1.entities.factory;

import org.example.sportiv.E1.entities.jucatori.JucatorAtacant;
import org.example.sportiv.E1.entities.jucatori.JucatorFundas;
import org.example.sportiv.E1.entities.jucatori.JucatorPortar;
import org.example.sportiv.E1.repository.ETipJucator;
import org.example.sportiv.E1.repository.IJucator;

public class JucatorFactory {
    public IJucator creareJucator(ETipJucator tipJucator) throws Exception {
        switch (tipJucator) {
            case PORTAR:
                return new JucatorPortar();
            case FUNDAS:
                return new JucatorFundas();
            case ATACANT:
                return new JucatorAtacant();
            default:
                throw new Exception("Nu exista acest tip de jucator!");
        }
    }
}
