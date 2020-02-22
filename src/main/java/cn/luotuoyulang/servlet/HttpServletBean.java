package cn.luotuoyulang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @Classname HttpServletBean
 * @Description TODO
 * @Date 2020/2/22 22:59
 * @Created by liuyuhu
 */
public abstract class HttpServletBean extends HttpServlet {

    public final void init() throws ServletException {
        initServletBean();
    }

    protected void initServletBean() throws ServletException {
    }
}
