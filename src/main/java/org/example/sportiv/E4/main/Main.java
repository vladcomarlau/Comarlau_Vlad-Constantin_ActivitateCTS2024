package org.example.sportiv.E4.main;

import org.example.sportiv.E4.entities.Account;
import org.example.sportiv.E4.repository.IAccount;

public class Main {
    public static void main(String[] args) {
        IAccount account = new Account();
        account.setId(1);
        account.loadAccount("account1");
        System.out.println(account);

        IAccount similarAccount = account.copyAccount();
        similarAccount.setId(2);
        similarAccount.addTicket("ticket4");
        System.out.println(similarAccount);

        System.out.println(account);

    }
}
