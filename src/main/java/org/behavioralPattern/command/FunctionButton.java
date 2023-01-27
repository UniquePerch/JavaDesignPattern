package org.behavioralPattern.command;

public class FunctionButton {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        System.out.println("单击按键");
        command.execute();
    }
}
