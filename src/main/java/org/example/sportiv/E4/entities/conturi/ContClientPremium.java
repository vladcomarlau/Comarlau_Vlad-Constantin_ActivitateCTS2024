package org.example.sportiv.E4.entities.conturi;

import java.util.ArrayList;

public class ContClientPremium extends ACont {
    public ContClientPremium() {
        this.tipCont = "client premium";
        this.listaBileteCumparate = new ArrayList<>();
        this.listaBileteCumparate.add("bonus premium BILET");
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
