package org.structuralPattern.decorator.concreteComponent;

import org.structuralPattern.decorator.Component;

public class Window extends Component {
    @Override
    public void display() {
        System.out.println("窗口显示");
    }
}
