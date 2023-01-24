package org.structuralPattern.bridge.OS;

import org.structuralPattern.bridge.entity.Matrix;

public class WindowsImpl implements OSImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在windosw上作图");
    }
}
