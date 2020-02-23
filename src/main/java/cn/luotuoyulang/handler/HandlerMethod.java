package cn.luotuoyulang.handler;

import java.lang.reflect.Method;

/**
 * @Classname HandlerMethod
 * @Description TODO
 * @Date 2020/2/23 14:11
 * @Created by liuyuhu
 */
public class HandlerMethod {

    private final Object bean;

    private final Method method;

    public HandlerMethod(Object bean, Method method) {
        this.bean = bean;
        this.method = method;
    }

    public Object getBean() {
        return bean;
    }

    public Method getMethod() {
        return method;
    }
}
