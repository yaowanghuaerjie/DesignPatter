package com.george.design.facadepattern.kfc_order;

public class EmployeeOne implements IWork{
    @Override
    public void doWork() {
        System.out.println("处理食材");
    }
}
