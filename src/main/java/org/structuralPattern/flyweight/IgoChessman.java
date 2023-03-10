package org.structuralPattern.flyweight;

public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("棋子颜色"+this.getColor()+" 棋子位置："+coordinates.getX()+","+coordinates.getY());
    }
}
