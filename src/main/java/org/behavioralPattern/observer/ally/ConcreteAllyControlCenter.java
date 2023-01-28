package org.behavioralPattern.observer.ally;

public class ConcreteAllyControlCenter extends AllyControlCenter{
    public ConcreteAllyControlCenter(String name){
        this.allyName = name;
        System.out.println(name+"战队组建成功");
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队的：" + name +"收到攻击");
        for (Observer observer : players){
            if(! observer.getName().equalsIgnoreCase(name)){
                observer.help();
            }
        }
    }
}
