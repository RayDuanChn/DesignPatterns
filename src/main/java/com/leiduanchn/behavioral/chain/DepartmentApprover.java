package com.leiduanchn.behavioral.chain;

/**
 * @author leiduanchn
 * @create 2020-02-07 1:39 p.m.
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }


    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println("request id= " + purchaseRequest.getId() + " was processed " + this.name);
        }else {
            nextApprover.processRequest(purchaseRequest);
        }
    }
}
