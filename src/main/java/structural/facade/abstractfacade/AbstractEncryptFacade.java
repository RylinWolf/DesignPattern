package structural.facade.abstractfacade;

/**
 * @author linexsong
 */
public abstract class AbstractEncryptFacade {
    /**
     * 文件加密方法
     *
     * @param fileSrc 源文件路径
     * @param fileDes 加密文件保存路径
     */
    public abstract void fileEncrypt(String fileSrc, String fileDes);
}
