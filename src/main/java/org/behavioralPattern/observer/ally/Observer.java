package org.behavioralPattern.observer.ally;

public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();

    public void beAttacked(AllyControlCenter allyControlCenter);
}
