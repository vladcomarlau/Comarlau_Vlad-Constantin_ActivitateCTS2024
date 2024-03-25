package org.example.spital.problema1.entities;

import org.example.spital.problema1.repository.IBuilder;

public class PacientBuilder implements IBuilder {
    private Pacient pacient;

    public PacientBuilder() {
        this.pacient = new Pacient(false, false,
                false, false);
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    public PacientBuilder setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.pacient.setHasMicDejunInclus(hasMicDejunInclus);
        return this;
    }

    public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.pacient.setHasPapuciDeCamera(hasPapuciDeCamera);
        return this;
    }

    public PacientBuilder setHasHalatPentruExterior(boolean hasHalatPentruExterior) {
        this.pacient.setHasHalatPentruExterior(hasHalatPentruExterior);
        return this;
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }
}
