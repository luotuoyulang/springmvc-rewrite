package cn.luotuoyulang.servlet.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @Classname WebApplicationInitializer
 * @Description TODO
 * @Date 2020/2/23 0:06
 * @Created by liuyuhu
 */
public interface WebApplicationInitializer {

    /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     * throws a {@code ServletException}
     */
    void onStartup(ServletContext servletContext) throws ServletException;

}
