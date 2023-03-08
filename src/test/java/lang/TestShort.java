package lang;

/**
 * @author pengfei.wang
 * created by 2022/10/11 17:03
 */
public class TestShort {
    public static void main(String[] args) {
        Short s0 = (short) 1;
        Short s1 = new Short((short) 1);
        Short s2 = new Short("1");
        short s3 = Short.parseShort("1", 10);
        short s4 = Short.parseShort("1");
        Short s5 = Short.valueOf("1", 10);
        Short s6 = Short.valueOf("1");
        Short s7 = Short.valueOf((short) 1);
        byte byteValue = s0.byteValue();
        short shortValue = s0.shortValue();
        int intValue = s0.intValue();
        long longValue = s0.longValue();
        float floatValue = s0.floatValue();
        double doubleValue = s0.doubleValue();
        String stringValue = s0.toString();
        int i = s0.compareTo(s1);
        int compare = Short.compare(s0, s1);
    }
}
