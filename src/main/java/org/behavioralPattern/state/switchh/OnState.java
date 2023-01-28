package org.behavioralPattern.state.switchh;

public class OnState extends SwitchState{
    @Override
    public void on(Switcher s) {
        System.out.println("已经打开");
    }

    @Override
    public void off(Switcher s) {
        System.out.println("关闭");
        s.setState(Switcher.getState("off"));
    }
}
