package org.structuralPattern.adapter;

public class CarAdapter extends CarChontroller{
    private CarSound carSound;
    private CarLamp carLamp;
    public CarAdapter(){
        this.carSound = new CarSound();
        this.carLamp = new CarLamp();
    }

    public CarAdapter(CarSound carSound, CarLamp carLamp){
        this.carSound  = carSound;
        this.carLamp = carLamp;
    }

    @Override
    public void phonate() {
        carSound.alarmSound();
    }

    @Override
    public void twinkle() {
        carLamp.alarmLamp();
    }
}
