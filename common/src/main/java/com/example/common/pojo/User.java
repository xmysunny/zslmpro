package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.common.pojo
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:06
 * @Description: user实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /** 用户id */
    private Integer id ;
    /** 账号 */
    private String account ;
    /** 密码 */
    private String password ;
    /** 角色;0表示管理员，1表示用户，2表示装修公司 */
    private Integer role ;
    /** 真实姓名 */
    private String name ;
    /** 手机号码 */
    private String phone ;
    /** 邮箱 */
    private String email ;
    /** 住址 */
    private String address ;
    /** 头像 */
    private String photo ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;

}
