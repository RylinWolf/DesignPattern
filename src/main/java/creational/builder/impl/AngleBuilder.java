package creational.builder.impl;

import creational.builder.AbstractActorBuilder;

/**
 * @author linexsong
 */
public class AngleBuilder extends AbstractActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("温柔");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");

    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
