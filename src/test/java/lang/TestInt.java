package lang;

/**
 * @author pengfei.wang created by 2022/10/22 22:39
 */
public class TestInt {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        Integer c = 180;
        int d = 180;
        System.out.println(a == b);
        System.out.println(c == d); // 对象和值无法比较，会自动拆箱 字节码为：invokevirtual #5 <java/lang/Integer.intValue : ()I>

        Integer e = Integer.valueOf(129);
        Integer f = Integer.valueOf(129);
        Integer g = Integer.valueOf(125);
        Integer h = Integer.valueOf(125);
        System.out.println(e == f);
        System.out.println(g == h);
        // ----------------------------------------------------------------------
        Integer i = new Integer(29);
        Integer j = new Integer("29");
        String k = Integer.toString(100, 10);
        String l = Integer.toUnsignedString(100, 10);
        String m = Integer.toHexString(16);
        String n = Integer.toOctalString(8);
        String o = Integer.toBinaryString(2);
        String p = Integer.toString(a);
        String q = Integer.toUnsignedString(b);
        int r = Integer.parseInt("473", 8);
        int s = Integer.parseInt("10");
        int t = Integer.parseUnsignedInt("10", 10);
        int u = Integer.parseUnsignedInt("10");
        int v = Integer.valueOf("473", 8);
        int w = Integer.valueOf("10");
        Integer x = Integer.valueOf(d);
        byte byteValue = a.byteValue();
        short shortValue = a.shortValue();
        int intValue = a.intValue();
        long longValue = a.longValue();
        float floatValue = a.floatValue();
        double doubleValue = a.doubleValue();
        String toString = a.toString();
        boolean equals = a.equals(b);
        Integer testA = Integer.getInteger("testA", a);
        Integer testB = Integer.getInteger("testB", d);
        Integer testC = Integer.getInteger("testC");
        Integer decode = Integer.decode("0x10");
        int compareTo = a.compareTo(b);
        int compare = Integer.compare(a, b);
        int compareUnsigned = Integer.compareUnsigned(c, d);
        long aLong = Integer.toUnsignedLong(a);
        int divideUnsigned = Integer.divideUnsigned(a, b);
        int remainderUnsigned = Integer.remainderUnsigned(c, d);
        int highestOneBit = Integer.highestOneBit(a);
        int lowestOneBit = Integer.lowestOneBit(b);
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(a);
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(a);
        int bitCount = Integer.bitCount(a);
        int rotateLeft = Integer.rotateLeft(a, b);
        int rotateRight = Integer.rotateRight(a, b);
        int reverse = Integer.reverse(a);
        int signum = Integer.signum(a);
        int reverseBytes = Integer.reverseBytes(a);
        int sum = Integer.sum(a, b);
        int max = Integer.max(a, b);
        int min = Integer.min(a, b);
    }
}
