package org.behavioralPattern.responsibilityChain;

public class President extends Approver{
    public President(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 500000){
            System.out.println("董事长:" + this.name + "通过审批");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
