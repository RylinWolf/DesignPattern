package structural.facade.abstractfacade;

import structural.adapter.adaptee.PoliceSound;
import structural.facade.FileReader;
import structural.facade.FileWriter;

/**
 * @author linexsong
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
    private final FileReader reader;
    private final FileWriter writer;
    private final NewCipherMachine cm;

    public NewEncryptFacade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.cm = new NewCipherMachine();
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
