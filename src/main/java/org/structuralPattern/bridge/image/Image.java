package org.structuralPattern.bridge.image;

import org.structuralPattern.bridge.OS.OSImpl;

public abstract class Image {
    OSImpl osImpl;  //此处即为桥接模式中的"桥"

    public void setOsImpl(OSImpl impl){
        this.osImpl = impl;
    }

    public abstract void parseFile(String filename);
}
