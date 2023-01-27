package org.behavioralPattern.responsibilityChain;

public class Main {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest();
        request.setAmount(100);
        Approver handler1,handler2,handler3,handler4;
        handler1 = new Director("a");
        handler2 = new VicePresident("b");
        handler3 = new President("c");
        handler4 = new Congress("d");
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler3.setSuccessor(handler4);
        handler1.processRequest(request);
    }
}
