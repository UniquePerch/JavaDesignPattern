package org.behavioralPattern.observer.ally;

public class Player implements Observer{
    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(this.name + "前往援救");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name+"被攻击");
        allyControlCenter.notifyObserver(this.name);
    }
}
