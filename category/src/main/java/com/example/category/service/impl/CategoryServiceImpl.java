package com.example.category.service.impl;

import com.example.category.dao.CategoryMapper;
import com.example.category.service.CategoryService;
import com.example.common.entity.MyParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.common.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.category.service
 * @Author: fj
 * @CreateTime: 2020-06-09 17:00
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public PageInfo<Category> queryAll(MyParam<Category> myParam) {
        myParam.getT().setName("%"+myParam.getT().getName()+"%");
        for (String str:myParam.getOrderParam()){

            PageHelper.orderBy(str);
        }
        PageHelper.startPage(myParam.getPageParam().getPageNum(), myParam.getPageParam().getPageSize());

        List<Category> categories = categoryMapper.queryAll(myParam.getT());


        return new PageInfo<Category>(categories);
    }
}
