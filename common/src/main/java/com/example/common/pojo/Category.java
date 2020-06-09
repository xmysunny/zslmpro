package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2020-06-09 16:50:38
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category  {

    /**
    * 类别id
    */
    private Integer id;
    /**
    * 类别名称
    */
    private String name;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新时间
    */
    private Date updatedTime;




}