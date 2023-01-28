package org.behavioralPattern.template;

public class Main {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.handle("willow","lyh701721");
    }
}
