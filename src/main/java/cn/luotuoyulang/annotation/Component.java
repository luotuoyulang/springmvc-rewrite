package cn.luotuoyulang.annotation;

import java.lang.annotation.*;

/**
 * @Classname Component
 * @Description TODO
 * @Date 2020/2/23 11:00
 * @Created by liuyuhu
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Indexed
public @interface Component {
    String value() default "";
}
