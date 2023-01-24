package org.creationalPattern.singleton;

public class LazySingleton {
    private volatile static LazySingleton instance = null;//保证线程可见性

    private LazySingleton(){}

    public static LazySingleton getInstance(){ //保证只有一个线程获取实例
        if(instance == null){
            //多重判断，防止出现对象不唯一的情况，假设A和B都能通过锁，此时A已经创建了实例，但是B不知道，接下来B会接着之前的工作再创建一个实例，所以要进行多重判断。
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
