package com.example.polyfood.Services;

import com.example.polyfood.Models.Product;
import com.example.polyfood.Models.ProductType;

import java.util.List;

public interface IProductServices {
    List<Product> getAllProduct();
    Product getProductById(int id);
    String getTypeOfProductByProductId(int id);
    List<String> getProductDetailByProductId(int id);
    List<Product> getProductsOrderByView();
    List<Product> getBestSeller();
    List<Product> getProductSale();
    List<Product> getProductsByType(int id);
    List<ProductType> getAllProductType();
    List<Product> getProductByRange(int low, int high);
}
