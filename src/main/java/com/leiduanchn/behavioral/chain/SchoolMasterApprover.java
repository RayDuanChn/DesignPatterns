package com.leiduanchn.behavioral.chain;

/**
 * @author leiduanchn
 * @create 2020-02-07 1:53 p.m.
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 30000) {
            System.out.println("request id= " + purchaseRequest.getId() + " was processed " + this.name);
        }else {
           // nextApprover .processRequest(purchaseRequest);
        }
    }
}
