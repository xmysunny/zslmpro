//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.product.controller;

import com.example.common.entity.MyParam;
import com.example.common.entity.MyRsp;
import com.example.common.pojo.Product;
import com.example.product.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController() {
    }

    @GetMapping({"product"})
    public MyRsp query(@RequestBody MyParam<Product> myParam) {
        System.out.println(myParam);
        PageInfo<Product> query = this.productService.query(myParam);
        return MyRsp.success(query);
    }
}
