package org.behavioralPattern.mediator;

public class SubConcreteMediator extends ConcreteMediator{
    public Label label;

    @Override
    public void componentChanged(Component component) {
        if(component == button){
            System.out.println("单击按钮");
            list.update();
            comboBox.update();
            textBox.update();
            label.update();
        }
        else if(component == list){
            System.out.println("选择用户");
            comboBox.select();
            textBox.setText();
        }
        else if(component == comboBox){
            System.out.println("从组合框中选择客户");
            comboBox.select();
            textBox.setText();
        }
    }
}
