package org.structuralPattern.decorator.concreteComponent;

import org.structuralPattern.decorator.Component;

public class TextBox extends Component {

    @Override
    public void display() {
        System.out.println("文本框显示");
    }
}
