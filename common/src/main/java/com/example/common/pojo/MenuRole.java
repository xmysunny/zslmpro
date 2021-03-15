package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.common.pojo
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:14
 * @Description: 角色菜单关联
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuRole {
    /** id */
    private Integer id ;
    /** 角色id */
    private Integer roleId ;
    /** 菜单id */
    private Integer menuId ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;
}
