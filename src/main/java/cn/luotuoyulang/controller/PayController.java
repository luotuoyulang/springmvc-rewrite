package cn.luotuoyulang.controller;

import cn.luotuoyulang.annotation.Controller;
import cn.luotuoyulang.annotation.RequestMapping;

/**
 * @Classname PayController
 * @Description TODO
 * @Date 2020/2/23 11:09
 * @Created by liuyuhu
 */
@Controller
public class PayController {

    @RequestMapping("/pay")
    public String pay(){
        System.out.println("调用到 controller 里面的方法啦。。。。。。。。。");
        return "pay";
    }
}
