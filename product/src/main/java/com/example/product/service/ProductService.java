
package com.example.product.service;

import com.example.common.entity.MyParam;
import com.example.common.pojo.Product;
import com.github.pagehelper.PageInfo;

public interface ProductService {
    PageInfo<Product> query(MyParam<Product> myParam);
}
