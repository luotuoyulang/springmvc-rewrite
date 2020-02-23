package cn.luotuoyulang.annotation;

import java.lang.annotation.*;

/**
 * @Classname RequestMapping
 * @Description TODO
 * @Date 2020/2/23 10:58
 * @Created by liuyuhu
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Mapping
public @interface RequestMapping {


    String value() default "";


//    @AliasFor("path")
//    String[] value() default {};
//
//    @AliasFor("value")
//    String[] path() default {};
//
//    RequestMethod[] method() default {};
//
//    String[] params() default {};
//
//    String[] headers() default {};
//
//    String[] consumes() default {};
//
//    String[] produces() default {};

}