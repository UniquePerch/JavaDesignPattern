package org.behavioralPattern.template;

public class SavingAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按定期计算利息！");
    }

    @Override
    protected boolean isSaving() {
        return true;
    }
}

