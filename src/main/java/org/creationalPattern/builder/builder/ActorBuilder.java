package org.creationalPattern.builder.builder;

import org.creationalPattern.builder.entity.Actor;

public abstract class ActorBuilder {
    Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }
}
