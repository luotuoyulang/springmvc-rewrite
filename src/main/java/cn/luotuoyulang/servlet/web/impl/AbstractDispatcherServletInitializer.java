package cn.luotuoyulang.servlet.web.impl;

import cn.luotuoyulang.servlet.DispatcherServlet;
import cn.luotuoyulang.servlet.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Classname AbstractDispatcherServletInitializer
 * @Description 注意这里不能为抽象类(abstract)否则利用反射初始化的时候就会报错，因为抽象类不能创建对象
 * @Date 2020/2/23 0:21
 * @Created by liuyuhu
 */
public class AbstractDispatcherServletInitializer implements WebApplicationInitializer {
    
    /**
     * @Description //TODO
     * @param servletContext
     * @return {@link }
     * @throws
     * @author liuyuhu
     * @date 2020/2/23 0:23
     */       
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 1、开始注册我们的 DispatcherServlet
        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet());
        dispatcherServlet.addMapping("/");
        dispatcherServlet.setLoadOnStartup(1);
    }
}
