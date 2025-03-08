package structural.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author linexsong
 */
public class FileReader {
    public String read(String filePath) {
        System.out.println("读取文件: " + filePath);
        var sb = new StringBuilder();
        try {
            // 初始化流
            FileInputStream fis = new FileInputStream(filePath);
            // 读取数据
            int data;
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            // 关闭流
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            throw new RuntimeException("文件操作出错");
        }
        return sb.toString();
    }
}
