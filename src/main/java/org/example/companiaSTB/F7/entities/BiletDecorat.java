package org.example.companiaSTB.F7.entities;

public class BiletDecorat extends Decorator{

    public BiletDecorat(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void adaugaAnuntReducere() {
        this.bilet.setMesaj("\nDe sarbatori primesti reducere 10%");
    }
}
