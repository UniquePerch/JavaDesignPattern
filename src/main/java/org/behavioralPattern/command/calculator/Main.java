package org.behavioralPattern.command.calculator;

public class Main {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        CalculateCommand command = new AddCommand();
        calculatorForm.setCommand(command);

        calculatorForm.calculate(5);
        calculatorForm.calculate(10);
        calculatorForm.calculate(5);
        calculatorForm.undo();
    }
}
