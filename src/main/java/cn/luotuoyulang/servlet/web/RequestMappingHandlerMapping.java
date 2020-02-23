package cn.luotuoyulang.servlet.web;

import cn.luotuoyulang.annotation.ComponentScan;
import cn.luotuoyulang.annotation.Controller;
import cn.luotuoyulang.annotation.RequestMapping;
import cn.luotuoyulang.config.SpringMvcConfig;
import cn.luotuoyulang.handler.HandlerMethod;
import cn.luotuoyulang.utils.ClassUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname RequestMappingHandlerMapping
 * @Description TODO
 * @Date 2020/2/23 10:51
 * @Created by liuyuhu
 */
public class RequestMappingHandlerMapping {

    private HashMap<String, HandlerMethod> registry = new HashMap<>();

    public void initHandlerMappings(){
        // 扫面所有controller包
        ComponentScan componentScan = SpringMvcConfig.class.getDeclaredAnnotation(ComponentScan.class);
        String packageValue = componentScan.value();
        // 如果扫描包为空，则不做任何处理
        if(StringUtils.isEmpty(packageValue)){
            return;
        }
        // 遍历每个类只要加上 RequestMapping 注解得类，都加到map集合中去
        List<Class<?>> classListByAnnotation = ClassUtil.getClassListByAnnotation(packageValue, Controller.class);
        for (Class<?> controllerClass : classListByAnnotation) {
            // 获取controller 里带有 mapping 方法
            Method[] methods = controllerClass.getMethods();
            for (Method method : methods) {
                RequestMapping declaredAnnotation = method.getDeclaredAnnotation(RequestMapping.class);
                if(declaredAnnotation == null){
                    continue;
                }
                // 把 requestMapping 存放到集合里
                String mappingUrl = declaredAnnotation.value();
                registry.put(mappingUrl,new HandlerMethod(ClassUtil.newInstance(controllerClass),method));
            }
        }
    }

    public HandlerMethod getRegistry(String url) {
        return registry.get(url);
    }
}
