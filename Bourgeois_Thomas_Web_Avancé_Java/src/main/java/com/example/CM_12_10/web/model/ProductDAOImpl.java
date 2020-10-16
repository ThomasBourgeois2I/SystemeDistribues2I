package com.example.CM_12_10.web.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO{

    private List<Product> products = new ArrayList<>();

    public ProductDAOImpl() {
        products.add(new Product(0, "Banane", 4));
        products.add(new Product(1, "Pomme", 7));
        products.add(new Product(2, "Poire", 2));
        products.add(new Product(3, "Kiwi", 9));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findOne(int code) {

        for (Product p : products)
            if (p.getCode() == code)
                return p;

        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
