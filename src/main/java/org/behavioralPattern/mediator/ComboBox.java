package org.behavioralPattern.mediator;

public class ComboBox extends Component{
    @Override
    public void update() {
        System.out.println("组合框添加一项");
    }
    public void select(){
        System.out.println("组合框选择一项");
    }
}
