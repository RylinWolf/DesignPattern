package structural.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author linexsong
 */
public class FileWriter {
    public void write(String encryptText, String filePath) {
        System.out.println("保存密文，写入文件: " + filePath);
        try {
            // 初始化流
            var fos = new FileOutputStream(filePath);
            // 写入文件
            fos.write(encryptText.getBytes());
            // 关闭流
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件不存在");
        } catch (IOException e) {
            throw new RuntimeException("写入文件出错");
        }
    }
}
