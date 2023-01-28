package org.behavioralPattern.observer.ally;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allyName;

    protected final ArrayList<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer observer){
        System.out.println(observer.getName()+"加入战队"+this.allyName);
        players.add(observer);
    }

    public void quit(Observer observer){
        System.out.println(observer.getName()+"退出游戏"+this.allyName);
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}
