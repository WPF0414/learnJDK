package lang;

/**
 * @author pengfei.wang
 * created by 2022/10/5 17:01
 */
public class TestBoolean {

        public static void main(String[] args) {
            Boolean a = new Boolean(true);
            Boolean b = new Boolean("yes");
            Boolean c = Boolean.parseBoolean("True");
            Boolean d = Boolean.valueOf(true);
            Boolean e = Boolean.valueOf("1");
            System.out.println(a.toString());

            System.setProperty("isVIP", "true");
            Boolean boo = Boolean.getBoolean("isVIP");
            System.out.println(boo);

            boolean f = true;
            boolean g = false;
            boolean logicalAnd = Boolean.logicalAnd(f, g);
            System.out.println(logicalAnd);
            boolean logicalOr = Boolean.logicalOr(f, g);
            System.out.println(logicalOr);
            boolean logicalXor = Boolean.logicalXor(f, g);
            System.out.println(logicalXor);
        }
}
