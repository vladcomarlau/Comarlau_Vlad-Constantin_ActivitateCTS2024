package org.example.banca.D7.main;

import org.example.banca.D7.entities.Client;
import org.example.banca.D7.entities.Facade;

public class Main {
    public static void main (String[] args){
        Client client1 = new Client(123446789,10);
        Facade.creeazaCont(client1);

        Client client2 = new Client(123123123,14);
        Facade.creeazaCont(client2);

        Client client3 = new Client(123456789,18);
        Facade.creeazaCont(client3);

        Client client4 = new Client(122456778,18);
        Facade.creeazaCont(client4);
    }
}
