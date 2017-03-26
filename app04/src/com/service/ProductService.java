package com.service;

import com.domain.Product;

/**
 * Created by zhaoke on 2017/3/26.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
