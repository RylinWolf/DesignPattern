package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linexsong
 */
public class Folder extends AbstractFile {
    private List<AbstractFile> list = new ArrayList<>();
    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    public void killVirus() {
        System.out.println("*****对文件夹 " + name + " 进行消毒*****");
        list.forEach(AbstractFile::killVirus);
    }

    @Override
    public AbstractFile getChild(Integer i) {
        return list.get(i);
    }
}
