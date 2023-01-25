package org.structuralPattern.flyweight;

import java.util.Hashtable;

public class IgoChessmanFactory {
    private static final IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable<String,IgoChessman> hashtable;
    private IgoChessmanFactory(){
        hashtable = new Hashtable<>();
        IgoChessman igoChessmanBlack = new BlackIgoChessman();
        IgoChessman igoChessmanWhite = new WhiteIgoChessman();
        hashtable.put("w",igoChessmanWhite);
        hashtable.put("b",igoChessmanBlack);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public IgoChessman getIgoChessman(String color){
        return hashtable.get(color);
    }
}
