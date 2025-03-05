package structural.bridge.img.abstraction;

import structural.bridge.img.implementor.ImageImp;

/**
 * Image 抽象类
 * 读取指定文件
 *
 * @author linexsong
 */
public abstract class AbstractImage {
    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    /**
     * 读取文件
     *
     * @param fileName 文件路径
     */
    public abstract void parseFile(String fileName);
}
