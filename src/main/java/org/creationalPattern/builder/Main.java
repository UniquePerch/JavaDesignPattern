package org.creationalPattern.builder;

import org.creationalPattern.builder.builder.ActorBuilder;
import org.creationalPattern.builder.builder.HeroBuilder;
import org.creationalPattern.builder.entity.Actor;

public class Main {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = new HeroBuilder();
        ActorBuilderDirector director = new ActorBuilderDirector();
        Actor actor = director.instence(actorBuilder);
        System.out.println(actor.toString());
    }
}
