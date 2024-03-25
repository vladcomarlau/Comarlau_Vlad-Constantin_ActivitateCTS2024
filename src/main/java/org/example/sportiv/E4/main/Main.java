package org.example.sportiv.E4.main;

import org.example.sportiv.E4.entities.PrototypeFactory;
import org.example.sportiv.E4.entities.conturi.ACont;

public class Main {
    public static void main(String[] args) {
        ACont contClientBasic = PrototypeFactory.getPrototipCont("basic");
        if(contClientBasic != null) {
                contClientBasic.setId(0);
                contClientBasic.setNumeDetinator("Comarlau Vlad");
                contClientBasic.adaugareBilet("AVP001");
        }
        System.out.println(contClientBasic);

        ACont contClientPremium = PrototypeFactory.getPrototipCont("premium");
        if(contClientPremium != null) {
            contClientPremium.setId(1);
            contClientPremium.setNumeDetinator(contClientBasic.getNumeDetinator());
            for(String bilet : contClientBasic.getListaBileteCumparate()){
                contClientPremium.getListaBileteCumparate().add(bilet);
            }
        }
        System.out.println(contClientPremium);
    }
}
