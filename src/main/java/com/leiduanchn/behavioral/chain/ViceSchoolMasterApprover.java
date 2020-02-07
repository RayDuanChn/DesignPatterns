package com.leiduanchn.behavioral.chain;

/**
 * @author leiduanchn
 * @create 2020-02-07 1:54 p.m.
 */
public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        // TODO Auto-generated method stub
        if(purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("request id= " + purchaseRequest.getId() + " was processed " + this.name);
        }else {
            nextApprover.processRequest(purchaseRequest);
        }
    }
}
