package structural.facade;

/**
 * 加密器
 *
 * @author linexsong
 */
public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文: ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            sb.append(plainText.charAt(i) % 7);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
