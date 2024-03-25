package org.example.spital.problema3.entities.factories;

import org.example.spital.problema3.entities.personalMedical.APersonalSpital;
import org.example.spital.problema3.entities.personalMedical.Medic;
import org.example.spital.problema3.repository.IFactory;

public class FactoryMedic implements IFactory {
    @Override
    public APersonalSpital crearePersonalSpital() {
        return new Medic();
    }
}
