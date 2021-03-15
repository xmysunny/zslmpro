package com.example.user.mapper;

import com.example.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.user.mapper
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:50
 * @Description: 持久化层接口
 */
@Mapper
public interface AdminMapper {
    //登录
    User adminLogin(User user);
}
