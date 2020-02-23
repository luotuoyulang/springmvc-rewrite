package cn.luotuoyulang.handler;

import cn.luotuoyulang.view.ModelAndView;

/**
 * @Classname HandlerExecutionChain
 * @Description TODO
 * @Date 2020/2/23 17:14
 * @Created by liuyuhu
 */
public class HandlerExecutionChain {

    HandlerMethod handlerMethod;

    public HandlerExecutionChain(HandlerMethod handlerMethod) {
        this.handlerMethod = handlerMethod;
    }

    public HandlerMethod getHandlerMethod() {
        return handlerMethod;
    }

    public ModelAndView handle(){
        try {
            if(handlerMethod == null){
                return null;
            }
            Object invoke = handlerMethod.getMethod().invoke(handlerMethod.getBean(), null);
            return new ModelAndView((String) invoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
