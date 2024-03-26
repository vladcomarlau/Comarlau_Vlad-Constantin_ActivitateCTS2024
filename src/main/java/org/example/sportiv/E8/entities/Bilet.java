package org.example.sportiv.E8.entities;

public class Bilet{
    private int id;
    private boolean vandut = false;

    public Bilet(int id) {
        this.id = id;
    }

    public void setVandut(boolean vandut) {
        this.vandut = vandut;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "id=" + id +
                ", vandut=" + vandut +
                '}';
    }
}
