package org.behavioralPattern.mediator;

public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        TextBox textBox = new TextBox();
        Label label = new Label();
        SubConcreteMediator mediator = new SubConcreteMediator();

        button.setMediator(mediator);
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        textBox.setMediator(mediator);
        label.setMediator(mediator);

        mediator.textBox = textBox;
        mediator.label = label;
        mediator.list = list;
        mediator.comboBox = comboBox;
        mediator.button = button;

        button.changed();
        System.out.println("-------------------");
        list.changed();
    }
}
