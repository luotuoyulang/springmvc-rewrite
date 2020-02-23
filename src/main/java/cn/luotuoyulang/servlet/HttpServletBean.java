package cn.luotuoyulang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doService(req,resp);
    }

    protected abstract void doService(HttpServletRequest req, HttpServletResponse resp);
}
