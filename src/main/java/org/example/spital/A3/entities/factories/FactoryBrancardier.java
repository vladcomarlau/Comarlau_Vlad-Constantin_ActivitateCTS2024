package org.example.spital.A3.entities.factories;

import org.example.spital.A3.entities.personalMedical.APersonalSpital;
import org.example.spital.A3.entities.personalMedical.Brancardier;
import org.example.spital.A3.repository.IFactory;

public class FactoryBrancardier implements IFactory {
    @Override
    public APersonalSpital crearePersonalSpital() {
        return new Brancardier();
    }
}
