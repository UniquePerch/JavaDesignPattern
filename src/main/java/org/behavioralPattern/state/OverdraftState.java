package org.behavioralPattern.state;

public class OverdraftState extends AccountState{

    public OverdraftState(AccountState state){
        this.account = state.account;
    }
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance()+amount);
        this.stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance()-amount);
        this.stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("支付利息");
    }

    @Override
    public void stateCheck() {
        if(account.getBalance() >= 0){
            account.setState(new NormalState(this));
        }
        else if(account.getBalance() <= -2000){
            account.setState(new RestrictState(this));
        }
    }
}
