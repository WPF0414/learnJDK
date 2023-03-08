package lang;

/**
 * @author pengfei.wang created by 2022/10/6 18:03
 */
public class TestByte {

    public static void main(String[] args) {
        Byte a = Byte.valueOf((byte)1);
        byte b = Byte.parseByte("3", 10);
        byte c = Byte.parseByte("3");
        Byte d = Byte.valueOf("2", 10);
        Byte e = Byte.valueOf("2");
        Byte decode = Byte.decode("10");
        Byte f = new Byte((byte)1);
        Byte g = new Byte("1");
        byte byteValue = a.byteValue();
        short shortValue = a.shortValue();
        int intValue = a.intValue();
        long longValue = a.longValue();
        float floatValue = a.floatValue();
        double doubleValue = a.doubleValue();
        String s = a.toString();
        boolean equals = a.equals(b);
        int i = a.compareTo(b);
        int compare = Byte.compare(a, b);
        System.out.println(a);

    }
}
