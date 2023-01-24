package org.structuralPattern.adapter;

public abstract class CarDefaultAdapter extends CarChontroller{ //缺省适配器:值实现暂时需要实现的方法
    @Override
    public void phonate() {

    }

    @Override
    public void twinkle() {
        System.out.println("该方法暂未实现");
    }//缺省适配器
}
