package org.behavioralPattern.command.calculator;

public class CalculatorForm {
    private CalculateCommand command;

    public void setCommand(CalculateCommand command) {
        this.command = command;
    }

    public void calculate(int value){
        int num = command.execute(value);
        System.out.println(num);
    }

    public void undo(){
        int num = command.undo();
        System.out.println(num);
    }
}
