package org.behavioralPattern.command;

public class CommandInvoker {
    private CommandQueue commandQueue;

    public CommandInvoker(CommandQueue commandQueue){
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call(){
        commandQueue.executeAll();
    }
}
