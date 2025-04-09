package structural.proxy;

import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = XmlUtil.getObject("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/structural/proxy/config.xml",
                "className", 0, Searcher.class);

        searcher.doSearch("123", "key");
    }
}
