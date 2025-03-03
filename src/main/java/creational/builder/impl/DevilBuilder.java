package creational.builder.impl;

import creational.builder.AbstractActorBuilder;

/**
 * @author linexsong
 */
public class DevilBuilder extends AbstractActorBuilder {
    @Override
    public void buildType() {
        actor.setType("devil");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
