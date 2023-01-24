package org.creationalPattern.methodFactory.product;

public class DBLogger implements Logger{
    @Override
    public void writeLog(String str) {
        System.out.println("数据库logger:"+str);
    }
}
