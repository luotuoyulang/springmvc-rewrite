package cn.luotuoyulang.annotation;

import java.lang.annotation.*;

/**
 * @Classname ComponentScan
 * @Description TODO
 * @Date 2020/2/23 10:57
 * @Created by liuyuhu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
//@Repeatable(ComponentScans.class)
public @interface ComponentScan {
//    @AliasFor("basePackages")
    String value() default "";

//    @AliasFor("value")
//    String[] basePackages() default {};
//
//    Class<?>[] basePackageClasses() default {};
//
//    Class<? extends BeanNameGenerator> nameGenerator() default BeanNameGenerator.class;
//
//    Class<? extends ScopeMetadataResolver> scopeResolver() default AnnotationScopeMetadataResolver.class;
//
//    ScopedProxyMode scopedProxy() default ScopedProxyMode.DEFAULT;
//
//    String resourcePattern() default "**/*.class";
//
//    boolean useDefaultFilters() default true;
//
//    ComponentScan.Filter[] includeFilters() default {};
//
//    ComponentScan.Filter[] excludeFilters() default {};
//
//    boolean lazyInit() default false;
//
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target({})
//    public @interface Filter {
//        FilterType type() default FilterType.ANNOTATION;
//
//        @AliasFor("classes")
//        Class<?>[] value() default {};
//
//        @AliasFor("value")
//        Class<?>[] classes() default {};
//
//        String[] pattern() default {};
//    }
}
