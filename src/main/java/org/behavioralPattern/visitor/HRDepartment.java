package org.behavioralPattern.visitor;

public class HRDepartment extends Department{
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工："+employee.getName()+"工作时间为："+employee.getWorkTime());
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时员工"+employee.getName()+"工作时间为："+employee.getWorkTime());
    }
}
