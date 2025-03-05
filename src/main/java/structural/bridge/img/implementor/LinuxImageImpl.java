package structural.bridge.img.implementor;

import structural.bridge.img.Matrix;

/**
 * @author linexsong
 */
public class LinuxImageImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Linux 系统绘制矩阵");
    }
}
