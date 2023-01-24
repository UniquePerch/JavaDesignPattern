package org.structuralPattern.adapter;

public abstract class CarChontroller { //抽象方法交给Adapter实现
    public void move(){
        System.out.println("车车正在移动");
    }
    public abstract void phonate();//发出声音
    public abstract void twinkle();//闪烁灯光
}
