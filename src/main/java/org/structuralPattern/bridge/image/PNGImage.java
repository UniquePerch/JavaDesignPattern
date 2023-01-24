package org.structuralPattern.bridge.image;

import org.structuralPattern.bridge.entity.Matrix;

public class PNGImage extends Image {
    @Override
    public void parseFile(String filename) {
        Matrix matrix = new Matrix();
        osImpl.doPaint(matrix);
        System.out.println(filename+"为PNG格式");
    }
}
