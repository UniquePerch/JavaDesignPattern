package org.behavioralPattern.visitor;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FulltimeEmployee("张三",4000,30);
        Employee employee1 = new ParttimeEmployee("李四",30,30);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
        employeeList.addEmployee(employee1);
        Department department = new FaDepartment();
        Department department1 = new HRDepartment();
        employeeList.accept(department1);
        System.out.println("--------------------------");
        employeeList.accept(department);
    }
}
