package org.structuralPattern.bridge;

import org.structuralPattern.bridge.OS.LinuxImpl;
import org.structuralPattern.bridge.OS.OSImpl;
import org.structuralPattern.bridge.OS.WindowsImpl;
import org.structuralPattern.bridge.image.BMPImage;
import org.structuralPattern.bridge.image.Image;
import org.structuralPattern.bridge.image.PNGImage;

public class Main {
    public static void main(String[] args) {
        OSImpl os = new WindowsImpl();
        Image image = new PNGImage();
        image.setOsImpl(os);
        image.parseFile("test");
    }
}
