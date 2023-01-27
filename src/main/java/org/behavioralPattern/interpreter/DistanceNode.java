package org.behavioralPattern.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DistanceNode extends AbstractNode{
    private String distance;
    @Override
    public String interpret() {
        return this.distance;
    }
}
