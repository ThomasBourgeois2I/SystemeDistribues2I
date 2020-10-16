package com.example.CM_12_10.web.controller;

import com.example.CM_12_10.web.model.Product;
import com.example.CM_12_10.web.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDAO metier;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
    @GetMapping("/getall")
    public List<Product> getall(){
        return metier.findAll();
    }

    @GetMapping("/getone/{code}")
    public Product getone(@PathVariable int code){
        return metier.findOne(code);
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody Product product){
        if(product==null)
            return ResponseEntity.noContent().build();
        else metier.save(product);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(product.getCode()).toUri();
        return ResponseEntity.created(uri).build();
    }





}
