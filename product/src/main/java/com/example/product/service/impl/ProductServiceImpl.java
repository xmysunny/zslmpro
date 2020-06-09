
package com.example.product.service.impl;

import com.example.common.entity.MyParam;
import com.example.common.pojo.Product;
import com.example.product.dao.ProductMapper;
import com.example.product.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    public ProductServiceImpl() {
    }

    public PageInfo<Product> query(MyParam<Product> myParam) {
        PageHelper.startPage(myParam.getPageParam().getPageNum(), myParam.getPageParam().getPageSize());
        String[] var2 = myParam.getOrderParam();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String orderBy = var2[var4];
            PageHelper.orderBy(orderBy);
        }

        List<Product> productList = this.productMapper.query((Product)myParam.getT());
        return new PageInfo(productList);
    }
}
