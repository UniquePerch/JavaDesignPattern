package org.behavioralPattern.interator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();
    public AbstractObjectList(List<Object> list){
        objects = list;
    }

    public void addObject(Object obj){
        objects.add(obj);
    }

    public void removeObject(Object o){
        objects.remove(o);
    }

    public List<Object> getObjects(){
        return this.objects;
    }

    public abstract AbstractIterator createIterator();
}
