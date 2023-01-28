package org.behavioralPattern.observer.ally;

public class Main {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("a战队");
        Observer observer1 = new Player("1");

        Observer observer2 = new Player("2");

        Observer observer3 = new Player("3");

        Observer observer4 = new Player("4");
        allyControlCenter.join(observer1);
        allyControlCenter.join(observer2);
        allyControlCenter.join(observer3);
        allyControlCenter.join(observer4);

        observer1.beAttacked(allyControlCenter);
    }


}
