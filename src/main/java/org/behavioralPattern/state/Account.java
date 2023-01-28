package org.behavioralPattern.state;

public class Account {
    private AccountState state;
    private String owner;

    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(owner+"开户，初始金额为："+balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount){
        System.out.println(this.owner+"存款"+amount);
        state.deposit(amount);
        showAccount();
    }

    public void withdraw(double amount){
        System.out.println(this.owner+"取款"+amount);
        state.withdraw(amount);
        showAccount();
    }

    public void showAccount(){
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在状态为" + this.state.getClass().getName());
    }

    public void computeInterest(){
        state.computeInterest();
    }
}
