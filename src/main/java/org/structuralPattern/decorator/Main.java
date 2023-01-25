package org.structuralPattern.decorator;

import org.structuralPattern.decorator.concreteComponent.ListBox;

public class Main {
    public static void main(String[] args) {
        Component component = new ListBox();
        ComponentDecorator componentDecorator = new BlackBorderDecorator(component);
        ComponentDecorator componentDecorator1 = new ScrollBarDecorator(componentDecorator); //二次装饰5
        componentDecorator1.display();
    }
}
