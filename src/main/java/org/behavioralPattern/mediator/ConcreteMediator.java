package org.behavioralPattern.mediator;

public class ConcreteMediator extends Mediator{
    public Button button;
    public List list;
    public TextBox textBox;
    public ComboBox comboBox;

    @Override
    public void componentChanged(Component component) {
        if(component == button){
            System.out.println("单击增加按钮");
            list.update();
            comboBox.update();
            textBox.update();
        }
        else if(component == list){
            System.out.println("从列表框选择用户");
            comboBox.update();
            textBox.setText();
        }
        else if(component == comboBox){
            System.out.println("从组合框选择用户");
            comboBox.select();
            textBox.setText();
        }
    }
}
