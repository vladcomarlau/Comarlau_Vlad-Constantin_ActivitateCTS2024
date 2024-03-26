package org.example.banca.D9.main;

import org.example.banca.D9.entities.Agentie;
import org.example.banca.D9.entities.Banca;
import org.example.banca.D9.entities.Filiala;
import org.example.banca.D9.entities.Sucursala;

public class Main {
    public static void main(String[] args) throws Exception {
        Filiala filiala1 = new Filiala("filiala1");
        Filiala filiala2 = new Filiala("filiala2");
        Filiala filiala3 = new Filiala("filiala3");
        Filiala filiala4 = new Filiala("filiala4");
        Filiala filiala5 = new Filiala("filiala5");

        Agentie agentie1 = new Agentie("agentie1");
        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);

        Agentie agentie2 = new Agentie("agentie2");
        agentie2.adaugaNod(filiala3);
        agentie2.adaugaNod(filiala4);

        Agentie agentie3 = new Agentie("agentie3");
        agentie3.adaugaNod(filiala5);

        Sucursala sucursala1 = new Sucursala("sucursala1");
        sucursala1.adaugaNod(agentie1);
        sucursala1.adaugaNod(agentie2);

        Sucursala sucursala2 = new Sucursala("sucursala2");
        sucursala2.adaugaNod(agentie3);

        Banca banca = new Banca("banca");
        banca.adaugaNod(sucursala1);
        banca.adaugaNod(sucursala2);

        banca.descriere(0);

        agentie2.stergeNod(filiala1);
        sucursala2.stergeNod(agentie3);

        banca.descriere(0);

        agentie1.getNod(0).descriere(0);

        filiala1.getNod(0);
    }
}
