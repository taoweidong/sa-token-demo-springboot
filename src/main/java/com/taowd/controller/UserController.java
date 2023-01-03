package com.taowd.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/user/")
//public class UserController {
//
//    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
//    @RequestMapping("doLogin")
//    public String doLogin(String username, String password) {
//        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
//        if ("zhang".equals(username) && "123456".equals(password)) {
//            StpUtil.login(10001);
//            return "登录成功";
//        }
//        return "登录失败";
//    }
//
//    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
//    @RequestMapping("isLogin")
//    public String isLogin() {
//        return "当前会话是否登录：" + StpUtil.isLogin();
//    }
//
//    /**
//     * 不需要认证
//     * 浏览器访问： http://localhost:8081/user/test
//     *
//     * @return
//     */
//    @GetMapping("test")
//    public String test() {
//        return "test";
//    }
//
//    /**
//     * 需要认证
//     * 浏览器访问： http://localhost:8081/user/test1
//     *
//     * @return
//     */
//    @GetMapping("test1")
//    public String test1() {
//        return "test1";
//    }
//
//}

@RestController
public class UserController {

    /**
     * 不需要认证
     * 浏览器访问： http://localhost:8081/test
     *
     * @return
     */
    @GetMapping("test")
    public String test() {
        return "test";
    }

    /**
     * 需要认证
     * 浏览器访问： http://localhost:8081/test1
     *
     * @return
     */
    @GetMapping("test1")
    public String test1() {
        return "test1";
    }
}