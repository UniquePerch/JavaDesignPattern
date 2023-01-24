package org.creationalPattern.builder.builder;

public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        super.actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        super.actor.setSex("Herosex");
    }

    @Override
    public void buildFace() {
        super.actor.setFace("Heroface");
    }

    @Override
    public void buildCostume() {
        super.actor.setCostume("HeroCostume");
    }

    @Override
    public void buildHairstyle() {
        super.actor.setHairstyle("HeroHairStyle");
    }
}
