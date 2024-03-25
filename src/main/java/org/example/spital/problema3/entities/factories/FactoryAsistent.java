package org.example.spital.problema3.entities.factories;

import org.example.spital.problema3.entities.personalMedical.APersonalSpital;
import org.example.spital.problema3.entities.personalMedical.Asistent;
import org.example.spital.problema3.repository.IFactory;

public class FactoryAsistent implements IFactory {
    @Override
    public APersonalSpital crearePersonalSpital() {
        return new Asistent();
    }
}
