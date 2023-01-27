package org.behavioralPattern.interpreter;

public class Main {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructHandler handler = new InstructHandler();
        handler.handle(instruction);
        System.out.println(handler.output());
    }
}
