package cn.luotuoyulang.servlet;

/**
 * @Classname DispatcherServlet
 * @Description TODO
 * @Date 2020/2/22 22:54
 * @Created by liuyuhu
 */
public class DispatcherServlet extends FrameworkServlet{

    @Override
    protected void onRefresh() {
        initStrategies();
    }

    protected void initStrategies() {
        System.out.println("DispatcherServlet  开始初始化。。。。。。。");
    }
}
