package structural.flyweight;

/**
 * @author linexsong
 */
public class StringFlyweight {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "abcde";
        String c = "abc" + "de";
        String d = "abc";
        d += "de";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
