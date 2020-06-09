
package com.example.product.dao;

import com.example.common.pojo.Product;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper {
    List<Product> query(Product product);
}
