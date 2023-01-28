package org.behavioralPattern.state.screen;

public class Main {//有环境类直接设置状态
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.click();
        screen.click();
        screen.click();
        screen.click();
        screen.click();
        screen.click();
    }
}
