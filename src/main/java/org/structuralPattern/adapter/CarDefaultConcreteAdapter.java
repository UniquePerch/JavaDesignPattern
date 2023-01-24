package org.structuralPattern.adapter;

public class CarDefaultConcreteAdapter extends CarDefaultAdapter {//缺省适配器实现
    private CarSound carSound;
    public CarDefaultConcreteAdapter(){
        this.carSound = new CarSound();
    }
    @Override
    public void phonate() {
        carSound.alarmSound();
    }
}
