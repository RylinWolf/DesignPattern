package structural.facade.abstractfacade;

/**
 * @author linexsong
 */
public class NewCipherMachine {
    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转为密文：");
        StringBuilder sb = new StringBuilder();
        // 设置移位
        int key = 10;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            // 小写字母
            if (c >= 'a' && c <= 'z') {
                c += (char) (key % 26);
                if (c > 'z') {
                    c -= 26;
                }
            }
            // 大写字母
            if (c >= 'A' && c <= 'Z') {
                c += (char) (key % 24);
                if (c > 'Z') {
                    c -= 26;
                }
            }
            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
