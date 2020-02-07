package com.leiduanchn.behavioral.chain;

/**
 * Chain of responsibility pattern
 *
 * is used to achieve loose coupling in software design
 * where a request from the client is passed to a chain of objects to process them.
 * Later, the object in the chain will decide themselves who will be processing the request
 * and whether the request is required to be sent to the next object in the chain or not.
 *
 *
 * Where and When Chain of Responsibility pattern is applicable :
 * - When you want to decouple a request’s sender and receiver
 * - Multiple objects, determined at runtime, are candidates to handle a request
 * - When you don’t want to specify handlers explicitly in your code
 * - When you want to issue a request to one of several objects without specifying the receiver explicitly.
 *
 * This pattern is recommended when multiple objects can handle a request and the handler doesn’t have to be a specific object.
 * Also, the handler is determined at runtime. Please note that a request not handled at all by any handler is a valid use case.
 *
 * Role:
 *
 * Handler : This can be an interface which will primarily receive the request and dispatches the request to chain of handlers.
 *           It has reference of only first handler in the chain and does not know anything about rest of the handlers.
 * Concrete handlers : These are actual handlers of the request chained in some sequential order.
 * Client : Originator of request and this will access the handler to handle it.
 *
 *
 * @author leiduanchn
 * @create 2020-02-07 1:18 p.m.
 */
public class Client {

    public static void main(String[] args) {

        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, -31000, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");


        //需要将各个审批级别的下一个设置好 (处理人构成环形:可以从任何节点调用。 最后一个节点不设置next， 必须从第一个节点调用 )
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);



        departmentApprover.processRequest(purchaseRequest);
        viceSchoolMasterApprover.processRequest(purchaseRequest);
    }

}
