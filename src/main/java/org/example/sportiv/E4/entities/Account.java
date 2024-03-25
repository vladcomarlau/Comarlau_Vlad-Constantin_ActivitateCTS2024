package org.example.sportiv.E4.entities;
import org.example.sportiv.E4.repository.IAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Account implements IAccount {
    private int id;
    private String clientName;
    private List<String> tickets;

    public Account() {
        this.tickets = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setTickets(List<String> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void addTicket(String ticket) {
        if(this.tickets != null) {
            this.tickets.add(ticket);
        }
    }

    @Override
    public void loadAccount(String account) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/main/java/org/example/sportiv/E4/repository/"
                            + account
                            + ".txt"));
            this.clientName = reader.readLine();
            String ticket;
            while((ticket = reader.readLine()) != null) {
                tickets.add(ticket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IAccount copyAccount() {
        Account account = new Account();
        account.setClientName(this.clientName);
        List<String> temporaryTickets = new ArrayList<>();
        temporaryTickets.addAll(this.tickets);
        account.setTickets(temporaryTickets);
        return account;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
