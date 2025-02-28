package tools;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author linexsong
 */
public class XmlUtil {
    /**
     * 从 XML 配置文件中提取指定标签的一级内容，并返回
     *
     * @param tag 指定标签
     * @return 对应的内容
     */
    public static String getNodeString(String filePath, String tag, Integer index) {
        try {
            // 创建文档对象
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new File(filePath));

            NodeList nl = doc.getElementsByTagName(tag);
            return nl.item(index).getChildNodes().item(index).getNodeValue().trim();

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
