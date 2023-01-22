package org.example.builder;

import javafx.scene.control.Accordion;
import org.example.builder.builder.ActorBuilder;
import org.example.builder.builder.AngelBuilder;
import org.example.builder.builder.HeroBuilder;
import org.example.builder.entity.Actor;

public class Main {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = new HeroBuilder();
        ActorBuilderDirector director = new ActorBuilderDirector();
        Actor actor = director.instence(actorBuilder);
        System.out.println(actor.toString());
    }
}
