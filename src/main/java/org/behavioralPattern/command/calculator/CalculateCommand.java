package org.behavioralPattern.command.calculator;

public abstract class CalculateCommand {
    public abstract int execute(int num);

    public abstract int undo();
}
