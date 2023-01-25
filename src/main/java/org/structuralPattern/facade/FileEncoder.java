package org.structuralPattern.facade;

public class FileEncoder {
    public String encode(String s){
        System.out.println("数据加密");
        String es = "";
        for (int i=0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
