package com.example.user.controller;

import com.example.common.entity.MyParam;
import com.example.common.entity.MyRsp;
import com.example.common.pojo.User;
import com.example.user.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.user.controller
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:17
 * @Description: 后台管理表现层
 */
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    /**
     * 管理员登录
     * @param myParam
     */
    @PostMapping("adminLogin")
    public MyRsp adminLogin(@RequestBody MyParam<User> myParam, HttpServletResponse response){
        System.out.println(myParam);
        System.out.println("adminLogin");
        MyRsp myRsp = adminService.adminLogin(myParam,response);
        return myRsp;
    }
}
