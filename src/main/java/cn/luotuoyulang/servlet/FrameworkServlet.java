package cn.luotuoyulang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname FrameworkServlet
 * @Description TODO
 * @Date 2020/2/22 22:58
 * @Created by liuyuhu
 */
public abstract class FrameworkServlet extends HttpServletBean{

    @Override
    protected final void initServletBean() throws ServletException {
        onRefresh();
    }

    protected void onRefresh() {
        // For subclasses: do nothing by default.
    }

    @Override
    protected void doService(HttpServletRequest req, HttpServletResponse resp) {

    }
}
