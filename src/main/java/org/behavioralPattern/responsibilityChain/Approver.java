package org.behavioralPattern.responsibilityChain;

public abstract class Approver {
    protected  Approver successor;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
