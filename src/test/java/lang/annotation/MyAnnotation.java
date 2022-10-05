package test.java.lang.annotation;

import java.lang.annotation.*;

/**
 * @author pengfei.wang
 * created by 2022/10/5 15:47
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String value() default "hello world!";
}
