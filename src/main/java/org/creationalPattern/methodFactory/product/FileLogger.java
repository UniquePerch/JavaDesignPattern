package org.creationalPattern.methodFactory.product;

public class FileLogger implements Logger{

    @Override
    public void writeLog(String str) {
        System.out.println("文件logger:"+str);
    }
}
