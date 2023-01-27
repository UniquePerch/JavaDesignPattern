package org.behavioralPattern.mediator;

public class TextBox extends Component{
    @Override
    public void update() {
        System.out.println("添加信息完成后清空文本框");
    }

    public void setText(){
        System.out.println("编辑文本框");
    }
}
