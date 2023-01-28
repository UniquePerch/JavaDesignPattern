package org.behavioralPattern.visitor;

public class FaDepartment extends Department{
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double workWage = employee.getWeeklyWage();
        if(workTime > 40){
            workWage = workWage + (workTime-40) * 100;
        }
        else{
            workWage = workWage - (40-workTime) * 80;
            if(workWage <= 0){
                workWage = 0;
            }
        }
        System.out.println("正式员工:"+employee.getName()+"实际工资为："+workWage);
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double workWage = employee.getHourWage() * workTime;
        System.out.println("临时员工:"+employee.getName()+"实际工资为："+workWage);
    }
}
