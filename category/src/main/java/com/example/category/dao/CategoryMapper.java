package com.example.category.dao;


import com.example.common.pojo.Category;

import java.util.List;


/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.category.dao
 * @Author: fj
 * @CreateTime: 2020-06-09 16:52
 * @Description:
 */
public interface CategoryMapper {

    public List<Category> queryAll(Category category);

}
