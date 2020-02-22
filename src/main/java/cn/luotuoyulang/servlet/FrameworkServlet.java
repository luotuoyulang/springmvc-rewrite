package cn.luotuoyulang.servlet;

import javax.servlet.ServletException;

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
}
