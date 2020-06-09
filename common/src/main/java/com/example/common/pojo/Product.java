package com.example.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id ;
    /** 产品名称 */
    private String productName ;
    /** 主图 */
    private String image ;
    /** 详情 */
    private String detail ;
    /** 价格 */
    private Double price ;
    /** 类别id */
    private Integer categoryId ;
    /** 公司id */
    private Integer storeId ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;


}
