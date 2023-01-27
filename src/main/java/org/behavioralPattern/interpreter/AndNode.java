package org.behavioralPattern.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndNode extends AbstractNode{
    private AbstractNode left;//左边的表达式
    private AbstractNode right;//右边的表达式

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
