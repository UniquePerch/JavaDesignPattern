package org.behavioralPattern.responsibilityChain;

public class Director extends Approver{
    public Director(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 50000){
            System.out.println("主任："+this.name+"通过审批");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
