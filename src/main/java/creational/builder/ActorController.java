package creational.builder;

/**
 * 充当 Actor 指挥者
 *
 * @author linexsong
 */
public class ActorController {
    public Actor constructor(AbstractActorBuilder builder) {
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.createActor();
    }
}
