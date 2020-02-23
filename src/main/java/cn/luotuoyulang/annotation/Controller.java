package cn.luotuoyulang.annotation;

import java.lang.annotation.*;

/**
 * @Classname Controller
 * @Description TODO
 * @Date 2020/2/23 10:56
 * @Created by liuyuhu
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
public @interface Controller {
//    @AliasFor(
//            annotation = Component.class
//    )
    String value() default "";
}
