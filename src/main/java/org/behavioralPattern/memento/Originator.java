package org.behavioralPattern.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this);
    }
    public void restoreMemento(Memento memento){
        state = memento.getState();
    }

    public Originator(String state) {
        this.state = state;
    }
}
