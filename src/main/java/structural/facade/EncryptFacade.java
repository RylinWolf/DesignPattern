package structural.facade;

/**
 * 文件加密器 外观类
 *
 * @author linexsong
 */
public class EncryptFacade {
    /**
     * 创建对子系统的引用
     */
    private final FileReader reader;
    private final FileWriter writer;
    private final CipherMachine cm;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.cm = new CipherMachine();
    }

    public void fileEncrypt(String fileSrc, String fileDes) {
        // 调用子系统的业务方法
        String read = reader.read(fileSrc);
        if (read == null || read.isBlank()) {
            return;
        }
        writer.write(cm.encrypt(read), fileDes);
    }
}
