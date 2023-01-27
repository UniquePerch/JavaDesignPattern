package org.behavioralPattern.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SentenceNode extends AbstractNode{
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    @Override
    public String interpret() {
        return direction.interpret()+action.interpret()+distance.interpret();
    }
}
