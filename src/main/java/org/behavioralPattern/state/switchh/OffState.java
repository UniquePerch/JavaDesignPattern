package org.behavioralPattern.state.switchh;

public class OffState extends SwitchState{

    @Override
    public void on(Switcher s) {
        System.out.println("打开！");
        s.setState(Switcher.getState("on"));
    }

    @Override
    public void off(Switcher s) {
        System.out.println("已经关闭！");
    }
}
