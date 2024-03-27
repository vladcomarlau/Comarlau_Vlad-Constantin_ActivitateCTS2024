package org.example.STB.F13.entities;

public class MementoAutobuz {
    String sofer;
    float consumMediu;

    public MementoAutobuz(String sofer, float consumMediu) {
        this.sofer = sofer;
        this.consumMediu = consumMediu;
    }

    public String getSofer() {
        return sofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }
}
