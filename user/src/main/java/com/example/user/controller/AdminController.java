package com.example.user.controller;

import com.example.common.entity.MyParam;
import com.example.common.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.user.controller
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:17
 * @Description: 后台管理表现层
 */
@RestController
public class AdminController {
    /**
     * 管理员登录
     * @param myParam
     */
    @PostMapping("adminLogin")
    public void adminLogin(@RequestBody MyParam<User> myParam){
        System.out.println(myParam);
        System.out.println("adminLogin");
    }
}
