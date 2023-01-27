package org.behavioralPattern.command;

public class Main {
    public static void main(String[] args) {
//        Command command = new HelpCommand();
//        FunctionButton functionButton = new FunctionButton();
//        functionButton.setCommand(command);
//        functionButton.click();

        CommandQueue commandQueue = new CommandQueue();//命令队列
        commandQueue.addCommand(new HelpCommand());
        commandQueue.addCommand(new HelpCommand());
        Command command = new ExitCommand();
        commandQueue.addCommand(command);
        commandQueue.removeCommand(command);
        CommandInvoker invoker = new CommandInvoker(commandQueue);
        invoker.call();

    }
}
