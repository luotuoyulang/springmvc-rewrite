package cn.luotuoyulang.servlet;

import cn.luotuoyulang.handler.HandlerExecutionChain;
import cn.luotuoyulang.handler.HandlerMethod;
import cn.luotuoyulang.servlet.web.RequestMappingHandlerMapping;
import cn.luotuoyulang.view.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname DispatcherServlet
 * @Description 注意：此处如果service 不生效，或者启动不走dispartcherservlet 就把 web.xml 删掉
 * @Date 2020/2/22 22:54
 * @Created by liuyuhu
 */
public class DispatcherServlet extends FrameworkServlet{

    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    public DispatcherServlet() {
        this.requestMappingHandlerMapping = new RequestMappingHandlerMapping();
    }

    @Override
    protected void onRefresh() {
        initStrategies();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service=====================");
        System.out.println("HttpServletRequest req "+ req.getParameter("name"));
        doService(req,resp);
    }

    @Override
    protected void doService(HttpServletRequest req, HttpServletResponse resp) {
        doDispatch(req, resp);
    }

    protected void initStrategies() {
        requestMappingHandlerMapping.initHandlerMappings();
        System.out.println("DispatcherServlet  开始初始化。。。。。。。");
    }

    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        // 1、获取
        String requestURI = request.getRequestURI();
        // 2、根据 url 获取对应的 handler
        HandlerExecutionChain mappedHandler = getHandler(requestURI);
        if (mappedHandler == null) {
            try {
                noHandlerFound(request, response);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("没有找到对应 url ...........................");
            }

        }
        // 3、利用Java 反射技术 调用方法， 返回 ModelAndView
        ModelAndView handle = mappedHandler.handle();
        // 4、服务得转发
        render(handle,request,response);

    }

    protected void render(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) {
        if(mv == null){
            return;
        }
        String viewName = mv.getViewName();
        try {
//            request.getRequestDispatcher("/WEB-INF/view/pay.jsp").forward(request, response);
            response.getWriter().println(viewName);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("转发出错"+ e.getMessage());
        }
    }

    protected void noHandlerFound(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendError(HttpServletResponse.SC_NOT_FOUND);
        throw new RuntimeException("没有找到对应 url ...........................");
    }

    private HandlerExecutionChain getHandler(String requestURI) {
        int first = requestURI.lastIndexOf("/");
        int end = requestURI.length();
        String uri = requestURI.substring( first, end);
        HandlerMethod registry = requestMappingHandlerMapping.getRegistry(uri);
        return new HandlerExecutionChain(registry);
    }
}
