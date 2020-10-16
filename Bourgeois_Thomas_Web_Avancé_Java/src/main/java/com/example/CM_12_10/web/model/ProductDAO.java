package com.example.CM_12_10.web.model;

import java.util.List;

public interface ProductDAO {

    List<Product> findAll();
    Product findOne(int code);
    Product save(Product product);

}
