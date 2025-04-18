package creational.prototype;

/**
 * 附件类
 *
 * @author linexsong
 */
public class Attachment {
    private String name;

    public void download() {
        System.out.println("下载附件，文件名为 " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
