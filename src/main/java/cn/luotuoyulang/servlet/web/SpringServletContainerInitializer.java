package cn.luotuoyulang.servlet.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @Classname SpringServletContainerInitializer
 * @Description TODO
 * @Date 2020/2/23 0:00
 * @Created by liuyuhu
 */
@HandlesTypes(WebApplicationInitializer.class)
public class SpringServletContainerInitializer implements ServletContainerInitializer {

    /**
     * @Description Servlet 初始化容器的时候会被调用到
     * @param set 获取到 WebApplicationInitializer 所有的子类
     * @param servletContext
     * @return {@link }
     * @throws
     * @author liuyuhu
     * @date 2020/2/23 0:03
     */
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        for (Class<?> aClass : set) {
            try {
                // 利用反射技术执行此方法
                System.err.println("*****************************************");
                Method method = aClass.getMethod("onStartup", ServletContext.class);
                Object o = aClass.newInstance();
                method.invoke(o,servletContext);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
