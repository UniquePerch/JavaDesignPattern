package org.creationalPattern.simpleFactory;

import org.creationalPattern.simpleFactory.entity.Human;
import org.creationalPattern.simpleFactory.entity.Man;
import org.creationalPattern.simpleFactory.entity.Robot;
import org.creationalPattern.simpleFactory.entity.Woman;

public class HumanFactory {
    public static Human createMan(String arg){
        if(arg.equals("M")) return new Man();
        else if (arg.equals("W")) return new Woman();
        else if (arg.equals("R")) return new Robot();
        else return null;
    }
}
