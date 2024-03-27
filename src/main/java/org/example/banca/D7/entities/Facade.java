package org.example.banca.D7.entities;

public class Facade {
    public static void creeazaCont(Client client) {
        Politie politie = new Politie();
        ReteaBanci reteaBanci = new ReteaBanci();

        int cnpClient = client.getCNP();
        String mesajPartial = "clientul cu CNP:" + cnpClient;

        if(client.getVarsta() >= 14) {
            if(!politie.esteCautat(cnpClient)) {
                if(!reteaBanci.areCreante(cnpClient)) {
                    System.out.println("contul a fost creat cu succes pentru "
                    + mesajPartial + "!");
                } else {
                    System.out.println(mesajPartial
                            + " are creante la alte banci!");
                }
            } else {
                System.out.println(mesajPartial
                        + " este cautat de politie!");
            }
        } else {
            System.out.println(mesajPartial + " nu are varsta minima!");
        }
    }
}
