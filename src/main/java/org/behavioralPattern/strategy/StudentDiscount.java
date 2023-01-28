package org.behavioralPattern.strategy;

public class StudentDiscount extends Discount{
    private static final double DISCOUNT = 0.8;
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return price*DISCOUNT;
    }
}
