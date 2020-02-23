package cn.luotuoyulang.annotation;

import java.lang.annotation.*;

/**
 * @Classname Configuration
 * @Description TODO
 * @Date 2020/2/23 10:57
 * @Created by liuyuhu
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
public @interface Configuration {
//    @AliasFor(
//            annotation = Component.class
//    )
    String value() default "";

//    boolean proxyBeanMethods() default true;
}
