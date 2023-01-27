package org.behavioralPattern.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ActionNode extends AbstractNode{
    private String action;


    @Override
    public String interpret() {
        if(action.equalsIgnoreCase("move")){
            return "移动";
        }
        else if(action.equalsIgnoreCase("run")){
            return "快速移动";
        }
        else return "无效指令";
    }
}
