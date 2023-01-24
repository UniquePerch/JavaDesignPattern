package org.creationalPattern.protoType.eneity;

import lombok.Data;

@Data
public class Attachment {
    String name;

    public void download(){
        System.out.println("正在下载");
    }
}
