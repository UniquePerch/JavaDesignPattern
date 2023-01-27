package org.behavioralPattern.responsibilityChain;

public class VicePresident extends Approver{
    public VicePresident(String name){
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 50000){
            System.out.println("副董事长:"+this.name+"通过审批");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
