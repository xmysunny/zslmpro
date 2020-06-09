package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.common.pojo
 * @Author: 殷俊
 * @CreateTime: 2020-06-09 17:13
 * @Description: 菜单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    /** id */
    private Integer id ;
    /** 菜单名称 */
    private String menuName ;
    /** 父id */
    private Integer parentId ;
    /** 图标 */
    private String iconcls ;
    /** 地址 */
    private String url ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;
}
