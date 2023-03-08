package lang.annotation;

/**
 * @author pengfei.wang created by 2023/3/7 20:01
 */
@MyAnnotation("not default value.")
public class TestAnnotation {

  public static void main(String[] args) {
    Class<TestAnnotation> clazz = TestAnnotation.class;
    MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
    System.out.println(annotation.value());

  }
}