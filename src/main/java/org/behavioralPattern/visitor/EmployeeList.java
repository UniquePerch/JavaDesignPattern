package org.behavioralPattern.visitor;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employeeList = new ArrayList<>();
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void accept(Department handler){
        for(Employee employee : employeeList){
            employee.accept(handler);
        }
    }
}
