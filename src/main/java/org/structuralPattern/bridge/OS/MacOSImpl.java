package org.structuralPattern.bridge.OS;

import org.structuralPattern.bridge.entity.Matrix;

public class MacOSImpl implements OSImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在MacOS上作图");
    }
}
