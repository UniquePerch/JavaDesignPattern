package org.behavioralPattern.memento.chess;

public class Main {
    public static void main(String[] args) {
        MementoCaretaker caretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        display(chessman);

        caretaker.setMemento(chessman.save());

        chessman.setY(4);
        display(chessman);

        chessman.restore(caretaker.getMemento(0));
        display(chessman);

    }

    public static void display(Chessman chessman){
        System.out.println(""+chessman.getLabel() + chessman.getX() + chessman.getY());
    }
}
