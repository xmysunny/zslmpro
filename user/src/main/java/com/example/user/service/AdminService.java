package com.example.user.service;

import com.example.common.entity.MyParam;
import com.example.common.entity.MyRsp;
import com.example.common.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.user.service
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:47
 * @Description: 管理员接口
 */
public interface AdminService {
    //管理员登录
    MyRsp adminLogin(MyParam<User> myParam, HttpServletResponse response);
}
