package com.example.SpringSecEx.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private record Product(Integer productId, String productName, double price){}

    List<Product> products = new ArrayList<>(
            List.of(
                    new Product(1, "iphone", 5999),
                    new Product(1, "Mac pro", 1231)
            )
    );

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping
    public Product saveProduct(@RequestBody  Product product){
        products.add(product);
        return product;
    }
}
