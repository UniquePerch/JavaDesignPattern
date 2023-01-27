package org.behavioralPattern.mediator;

public class List extends Component{
    @Override
    public void update() {
        System.out.println("列表更新一项");
    }

    public void select(){
        System.out.println("列表选择一项");
    }
}
