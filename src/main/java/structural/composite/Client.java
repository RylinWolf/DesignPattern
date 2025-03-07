package structural.composite;

import java.io.File;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, folder1, folder2, folder3, folder4;

        folder1 = new Folder("My Documents");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new VideoFile("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder4.add(file4);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();

    }
}
