package org.structuralPattern.decorator;

import org.structuralPattern.decorator.Component;
import org.structuralPattern.decorator.ComponentDecorator;

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar(){
        System.out.println("添加了滚动条");
    }
}
