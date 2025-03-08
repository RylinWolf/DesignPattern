package structural.facade;

/**
 * @author linexsong
 */
public class EncryptClient {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt("./src/main/java/structural/facade/output/1.txt",
                "./src/main/java/structural/facade/output/des.txt");
    }
}
