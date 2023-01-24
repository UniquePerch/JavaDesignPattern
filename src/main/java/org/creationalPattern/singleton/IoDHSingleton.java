package org.creationalPattern.singleton;
//  减少内存消耗
public class IoDHSingleton {
    private  IoDHSingleton(){}

    private static class HolderClass{
        private final static IoDHSingleton ioDHSingleton = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return HolderClass.ioDHSingleton;
    }
}
