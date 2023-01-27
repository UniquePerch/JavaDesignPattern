package org.behavioralPattern.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DirectionNode extends AbstractNode{
    private String direction;


    @Override
    public String interpret() {
        if(direction.equalsIgnoreCase("up")){
            return "向上";
        }
        if(direction.equalsIgnoreCase("down")){
            return "向下";
        }
        if(direction.equalsIgnoreCase("left")){
            return "向左";
        }
        if(direction.equalsIgnoreCase("right")){
            return "向右";
        }
        else {
            return "无效指令";
        }
    }
}
