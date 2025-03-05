package structural.bridge.img.abstraction;

import structural.bridge.img.Matrix;

/**
 * 扩充抽象类
 *
 * @author linexsong
 */
public class PngImage extends AbstractImage {
    @Override
    public void parseFile(String fileName) {
        System.out.println("解析 PNG 文件 " + fileName);
        imageImp.doPaint(new Matrix());
    }
}
