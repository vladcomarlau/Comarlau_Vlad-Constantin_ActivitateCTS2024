package org.example.STB.F13.entities;

public class Autobuz {
    private String sofer;
    private float consumMediu;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String sofer, float consumMediu, String model, int anFabricatie, int nrLocuri) {
        this.sofer = sofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "sofer='" + sofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    public MementoAutobuz salvareMemento() {
        return new MementoAutobuz(sofer, consumMediu);
    }

    public void undoToMemento(MementoAutobuz memento) {
        this.sofer = memento.getSofer();
        this.consumMediu = memento.getConsumMediu();
    }
}
