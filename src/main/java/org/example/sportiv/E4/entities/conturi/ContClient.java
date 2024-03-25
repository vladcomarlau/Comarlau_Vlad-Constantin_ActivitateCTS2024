package org.example.sportiv.E4.entities.conturi;

import java.util.ArrayList;

public class ContClient extends ACont {
    public ContClient() {
        this.tipCont = "client basic";
        this.listaBileteCumparate = new ArrayList<>();
    }
    @Override
    public ACont clone() {
        ACont clone = super.clone();
        clone.listaBileteCumparate = new ArrayList<>();
        for(String bilet:listaBileteCumparate) {
            clone.listaBileteCumparate.add(bilet);
        }
        return clone;
    }
}
