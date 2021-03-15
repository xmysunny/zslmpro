package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.common.pojo
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:12
 * @Description: 角色
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    /** 角色id */
    private Integer id ;
    /** 角色名称 */
    private String roleName ;
    /** 角色描述 */
    private String describle ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;
}
