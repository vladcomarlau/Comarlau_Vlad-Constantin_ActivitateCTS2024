package org.example.sportiv.E4.entities;

import org.example.sportiv.E4.entities.conturi.ACont;
import org.example.sportiv.E4.entities.conturi.ContClient;
import org.example.sportiv.E4.entities.conturi.ContClientPremium;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, ACont> prototipuriConturi = new HashMap<>();

    static {
        ContClient contClient = new ContClient();
        prototipuriConturi.put("basic", contClient);

        ContClientPremium contClientPremium = new ContClientPremium();
        prototipuriConturi.put("premium", contClientPremium);
    }

    public static ACont getPrototipCont(String tip) {
        ACont cont = null;
        ACont prototipCont = prototipuriConturi.get(tip);
        if(prototipCont != null) {
            cont = prototipCont.clone();
        }
        return cont;
    }
}
