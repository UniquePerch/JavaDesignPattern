package org.example.protoType.eneity;

import lombok.Data;

import java.io.*;

@Data
public class WeeklyLog implements Cloneable, Serializable {
    Attachment attachment;
    String name;
    String date;
    String content;

    @Override
    public WeeklyLog clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持复制");
            return null;
        }
    }

    public WeeklyLog deepColne() throws IOException, ClassNotFoundException { //通过流来实现深克隆
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream arrayOutputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(arrayOutputStream);
        return (WeeklyLog) objectInputStream.readObject();
    }
}
