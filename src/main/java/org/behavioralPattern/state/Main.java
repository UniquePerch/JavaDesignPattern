package org.behavioralPattern.state;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("a",0.0);
        account.withdraw(3000);
        account.withdraw(3000);
        account.deposit(2000);
        account.withdraw(1000);
        account.deposit(4000);
        account.computeInterest();
    }
}
