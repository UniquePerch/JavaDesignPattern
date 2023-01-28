package org.behavioralPattern.state;

public class RestrictState extends AccountState{

    public RestrictState(AccountState state){
        this.account = state.account;
    }
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance()+amount);
        this.stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("受限模式不能取钱");
        this.stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void stateCheck() {
        if(account.getBalance() >=0){
            account.setState(new NormalState(this));
        }
        else if( account.getBalance()<=0 && account.getBalance()>-2000){
            account.setState(new OverdraftState(this));
        }
    }
}
