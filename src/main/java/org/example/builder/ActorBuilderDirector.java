package org.example.builder;

import org.example.builder.builder.ActorBuilder;
import org.example.builder.entity.Actor;

public class ActorBuilderDirector {
    public Actor instence(ActorBuilder builder){
        Actor actor;
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildHairstyle();
        builder.buildCostume();
        actor = builder.createActor();
        return actor;
    }
}
