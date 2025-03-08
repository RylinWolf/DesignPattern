package structural.facade.abstractfacade;

import structural.facade.CipherMachine;
import structural.facade.FileReader;
import structural.facade.FileWriter;

/**
 * @author linexsong
 */
public class EncryptFacade extends AbstractEncryptFacade {
    private final FileReader reader;
    private final FileWriter writer;
    private final CipherMachine cm;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.cm = new CipherMachine();
    }

    @Override
    public void fileEncrypt(String fileSrc, String fileDes) {
        String read = reader.read(fileSrc);
        if (read == null || read.isBlank()) {
            return;
        }
        writer.write(cm.encrypt(read), fileDes);
    }
}
