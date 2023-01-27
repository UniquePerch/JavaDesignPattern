package org.behavioralPattern.command.calculator;

public class AddCommand extends CalculateCommand{
    private static final Adder adder = new Adder();
    private int value;
    @Override
    public int execute(int num) {
        this.value = num;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
