package org.behavioralPattern.command;

public class ExitCommand extends Command{
    private ExitSystemClass exitSystemClass;

    public ExitCommand(){
        this.exitSystemClass = new ExitSystemClass();
    }

    @Override
    public void execute() {
        exitSystemClass.exit();
    }
}
