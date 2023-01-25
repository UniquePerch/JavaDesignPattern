package org.structuralPattern.flyweight;

public class Main {
    public static void main(String[] args) {
        IgoChessman black1,black2,black3;
        IgoChessman white1,white2,white3;
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        white3 = factory.getIgoChessman("w");
        System.out.println(black1 == black2);
        white3.display(new Coordinates(1,2));
        black3.display(new Coordinates(2,3));
    }
}
