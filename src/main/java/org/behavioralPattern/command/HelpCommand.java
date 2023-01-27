package org.behavioralPattern.command;

public class HelpCommand extends Command{
    private HelpCommandClass helpCommandClass;

    public HelpCommand(){
        helpCommandClass = new HelpCommandClass();
    }

    @Override
    public void execute() {
        helpCommandClass.display();
    }
}
