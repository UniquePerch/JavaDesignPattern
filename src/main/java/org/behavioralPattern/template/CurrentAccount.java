package org.behavioralPattern.template;

public class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按活期计算利息");
    }

    @Override
    protected boolean isSaving() {
        return false;
    }
}
