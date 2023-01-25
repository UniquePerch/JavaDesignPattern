package org.structuralPattern.decorator;

public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder(){
        System.out.println("设置了黑色边框");
    }
}
