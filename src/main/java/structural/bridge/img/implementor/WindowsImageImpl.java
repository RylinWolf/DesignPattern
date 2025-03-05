package structural.bridge.img.implementor;

import structural.bridge.img.Matrix;

/**
 * @author linexsong
 */
public class WindowsImageImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("windows 系统绘制矩阵");
    }
}
