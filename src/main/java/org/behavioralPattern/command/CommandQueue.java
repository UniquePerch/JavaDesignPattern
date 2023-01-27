package org.behavioralPattern.command;

import java.util.ArrayList;

public class CommandQueue { //请求队列
    private static final ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void executeAll(){
        for (Command command : commands){
            command.execute();
        }
    }
}
