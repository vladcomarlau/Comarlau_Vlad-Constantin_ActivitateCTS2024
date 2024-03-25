package org.example.sportiv.E4.repository;

public interface IAccount {
    void setId(int i);
    void loadAccount(String account1);
    IAccount copyAccount();
    void addTicket(String ticket);
}
