package org.creationalPattern.protoType;

import org.creationalPattern.protoType.eneity.WeeklyLog;
import org.creationalPattern.protoType.eneity.WeeklyLogA;
import org.creationalPattern.protoType.eneity.WeeklyLogB;

import java.util.Hashtable;

public class ProtoTypeMannager {
    private final Hashtable<String, WeeklyLog> protoTypeTable = new Hashtable<>();

    public ProtoTypeMannager(){
        protoTypeTable.put("A",new WeeklyLogA());
        protoTypeTable.put("B",new WeeklyLogB());
    }

    public void add(String key,WeeklyLog weeklyLog){
        protoTypeTable.put(key,weeklyLog);
    }

    public WeeklyLog get(String key){
        return protoTypeTable.get(key).clone();
    }
}
