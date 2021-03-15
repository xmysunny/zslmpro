package com.example.category.service;


import com.example.common.entity.MyParam;
import com.example.common.pojo.Category;
import com.github.pagehelper.PageInfo;


/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.category.service
 * @Author: fj
 * @CreateTime: 2020-06-09 16:59
 * @Description:
 */
public interface CategoryService {

    public PageInfo<Category> queryAll(MyParam<Category> myParam);
}
