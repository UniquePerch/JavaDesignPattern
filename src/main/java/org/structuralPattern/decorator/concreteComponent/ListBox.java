package org.structuralPattern.decorator.concreteComponent;

import org.structuralPattern.decorator.Component;

public class ListBox extends Component {
    @Override
    public void display() {
        System.out.println("列表框显示");
    }
}
