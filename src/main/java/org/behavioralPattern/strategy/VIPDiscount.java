package org.behavioralPattern.strategy;

public class VIPDiscount extends Discount{
    private final static double DISCOUNT = 0.5;
    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        System.out.println("增加积分！");
        return price*DISCOUNT;
    }
}
