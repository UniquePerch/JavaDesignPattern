package org.behavioralPattern.observer;

import java.util.Observable;

public class ConcreteSubject extends Subject{
    @Override
    public void nottify() {
        for (Observer observer : observers){
            observer.update();
        }
    }
}
