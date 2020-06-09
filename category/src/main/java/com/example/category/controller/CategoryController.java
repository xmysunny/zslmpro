package com.example.category.controller;

import com.example.category.service.CategoryService;
import com.example.common.entity.MyParam;
import com.example.common.entity.MyRsp;
import com.github.pagehelper.PageInfo;
import com.example.common.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: zslmpro
 * @BelongsPackage: com.example.category.web
 * @Author: fj
 * @CreateTime: 2020-06-09 17:08
 * @Description:
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("queryAll")
    public MyRsp queryAll(@RequestBody MyParam<Category> myParam) {
        PageInfo<Category> categoryPageInfo = categoryService.queryAll(myParam);

        return MyRsp.success(categoryPageInfo);
    }

}
