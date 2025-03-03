package creational.prototype;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log, newLog;
        log = new WeeklyLog();

        Attachment attachment = new Attachment();
        attachment.setName("附件1");
        log.setAttachment(attachment);

        newLog = log.clone();
        System.out.println("周报是否相同: " + (log == newLog));
        System.out.println("附件是否相同: " + (log.getAttachment() == newLog.getAttachment()));
    }
}
