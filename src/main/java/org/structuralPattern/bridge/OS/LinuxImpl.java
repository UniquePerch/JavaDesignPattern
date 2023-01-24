package org.structuralPattern.bridge.OS;

import org.structuralPattern.bridge.entity.Matrix;

public class LinuxImpl implements OSImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux上作图");
    }
}
