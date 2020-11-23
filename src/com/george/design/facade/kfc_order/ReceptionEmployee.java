package com.george.design.facade.kfc_order;

public class ReceptionEmployee {
    private IWork employeeOne;
    private IWork employeeTwo;

    public ReceptionEmployee(IWork employeeOne, IWork employeeTwo) {
        this.employeeOne = employeeOne;
        this.employeeTwo = employeeTwo;
    }

    public void orderFood() {
        System.out.println("您好，已帮您点好餐了，请您找个位置坐下来，待会儿叫好青岛这里取餐");
        employeeOne.doWork();
        employeeTwo.doWork();
        getFood();
    }

    private void getFood() {
        System.out.println("001号顾客请取餐");
    }

    public static void main(String[] args) {
        ReceptionEmployee receptionEmployee = new ReceptionEmployee(new EmployeeOne(), new EmployeeTwo());
        receptionEmployee.orderFood();

    }
}
