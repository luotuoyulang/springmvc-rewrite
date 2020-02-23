package cn.luotuoyulang.view;

/**
 * @Classname ModelAndView
 * @Description TODO
 * @Date 2020/2/23 19:53
 * @Created by liuyuhu
 */
public class ModelAndView {

    // 跳转页面名称
    private String viewName;

    public ModelAndView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }
}
