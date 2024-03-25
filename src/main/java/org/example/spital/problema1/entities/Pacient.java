package org.example.spital.problema1.entities;

public class Pacient {
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatPentruExterior;

    Pacient(boolean hasPatRabatabil, boolean hasMicDejunInclus,
            boolean hasPapuciDeCamera, boolean hasHalatPentruExterior) {
        super();
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatPentruExterior = hasHalatPentruExterior;
    }

    void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    void setHasHalatPentruExterior(boolean hasHalatPentruExterior) {
        this.hasHalatPentruExterior = hasHalatPentruExterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejunInlcus=" + hasMicDejunInclus +
                ", hasPapuciDeCamera=" + hasPapuciDeCamera +
                ", hasHalatPentruExterior=" + hasHalatPentruExterior +
                '}';
    }
}
