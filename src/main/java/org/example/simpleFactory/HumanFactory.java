package org.example.simpleFactory;

import org.example.simpleFactory.entity.Human;
import org.example.simpleFactory.entity.Man;
import org.example.simpleFactory.entity.Robot;
import org.example.simpleFactory.entity.Woman;

public class HumanFactory {
    public static Human createMan(String arg){
        if(arg.equals("M")) return new Man();
        else if (arg.equals("W")) return new Woman();
        else if (arg.equals("R")) return new Robot();
        else return null;
    }
}
