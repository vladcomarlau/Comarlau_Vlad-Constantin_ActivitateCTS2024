package org.example.banca.D7.entities;

public class Client {
    private final int CNP;
    private final int varsta;

    public Client(int CNP, int varsta) {
        this.CNP = CNP;
        this.varsta = varsta;
    }

    public int getCNP() {
        return CNP;
    }

    public int getVarsta() {
        return varsta;
    }
}
