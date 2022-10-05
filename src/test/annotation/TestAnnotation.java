package test.annotation;

/**
 * @author pengfei.wang
 * created by 2022/10/5 15:44
 */
@MyAnnotation("not default value.")
public class TestAnnotation {

    public static void main(String[] args) {
        Class<TestAnnotation> clazz = TestAnnotation.class;
        MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}
