package org.behavioralPattern.state.switchh;

public class Main { //实现共享状态模式
    public static void main(String[] args) {
        Switcher s1 = new Switcher("开关1");
        Switcher s2 = new Switcher("开关2");
        s1.off();
        s2.off();
        s1.on();
        s2.on();
    }
}
