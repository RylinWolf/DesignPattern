package structural.bridge.img.implementor;

import structural.bridge.img.Matrix;

/**
 * 实现类接口
 *
 * @author linexsong
 */
public interface ImageImp {
    /**
     * 绘制矩阵
     *
     * @param m 矩阵
     */
    void doPaint(Matrix m);
}
