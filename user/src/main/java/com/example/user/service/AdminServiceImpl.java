package com.example.user.service;


import com.example.common.entity.Const;
import com.example.common.entity.MyParam;
import com.example.common.entity.MyRsp;
import com.example.common.pojo.User;
import com.example.user.auth.JWTUtil;
import com.example.user.mapper.AdminMapper;
//import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.user.service
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:48
 * @Description: 管理员接口实现类
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    //管理员登录
    @Override
    public MyRsp adminLogin(MyParam<User> myParam, HttpServletResponse response) {
        User user = myParam.getT();
        /*使用MD5生成新密码*/
        Md5Hash md5Hash = new Md5Hash(user.getPassword(), Const.SALT,Const.HASHNUM);
        String newPassword = md5Hash.toString();
        /*将新密码存入对象*/
        user.setPassword(newPassword);
        User user1 = adminMapper.adminLogin(user);
        if (user1==null){
            return MyRsp.fail().msg("登录失败");
        }else{
            //登录成功,将信息存入token
            JWTUtil.login(user1,response);
            System.out.println(user1);
            return MyRsp.success("登录成功");
        }
    }
}
