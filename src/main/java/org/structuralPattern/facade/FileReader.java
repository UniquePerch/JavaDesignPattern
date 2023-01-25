package org.structuralPattern.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class FileReader {
    public String read(String path){
        System.out.println("读取文件");
        StringBuffer buffer = new StringBuffer();
        try (FileInputStream fileInputStream = new FileInputStream(path)){
            int data;
            while ((data = fileInputStream.read()) != -1){
                buffer.append(data);
            }
            System.out.println(buffer);
        }catch (FileNotFoundException e){
            System.out.println("没有文件");
        }catch (IOException e){
            System.out.println("操作错误");
        }
        return buffer.toString();
    }
}
