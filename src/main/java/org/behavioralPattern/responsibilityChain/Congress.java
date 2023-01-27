package org.behavioralPattern.responsibilityChain;

public class Congress extends Approver{
    public Congress(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 1000000){
            System.out.println("董事会："+this.name+"通过审批");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
