package structural.composite;

/**
 * @author linexsong
 */
public class VideoFile extends AbstractFile {
    private final String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持该方法");
    }

    @Override
    public void killVirus() {
        System.out.println("-----对视频文件" + name + "进行消毒-----");
    }

    @Override
    public AbstractFile getChild(Integer i) {
        System.out.println("不支持该方法");

        return null;
    }
}
