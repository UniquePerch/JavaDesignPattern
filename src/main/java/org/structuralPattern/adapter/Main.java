package org.structuralPattern.adapter;

public class Main {
    public static void main(String[] args) {
        CarChontroller carChontroller = new CarDefaultConcreteAdapter();
        carChontroller.move();
        carChontroller.phonate();
        carChontroller.twinkle();
    }
}
