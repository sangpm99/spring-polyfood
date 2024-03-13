package com.example.polyfood.Controllers;

import com.example.polyfood.Models.Product;
import com.example.polyfood.Models.ProductType;
import com.example.polyfood.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product/")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @RequestMapping(value = "getallproduct", method = RequestMethod.GET)
    public List<Product> getAllProduct() {
        return productServices.getAllProduct();
    }

    @RequestMapping(value = "getproductbyid", method = RequestMethod.GET)
    public Product getProductById(@RequestParam int id) {
        return productServices.getProductById(id);
    }

    @RequestMapping(value = "gettypeofproductbyproductid", method = RequestMethod.GET)
    public String getTypeOfProductByProductId(@RequestParam int id) {
        return productServices.getTypeOfProductByProductId(id);
    }

    @RequestMapping(value = "getproductdetailbyproductid", method = RequestMethod.GET)
    public List<String> getProductDetailByProductId(@RequestParam int id) {
        return productServices.getProductDetailByProductId(id);
    }

    @RequestMapping(value = "getproductsorderbyview", method = RequestMethod.GET)
    public List<Product> getProductsOrderByView() {
        return productServices.getProductsOrderByView();
    }

    @RequestMapping(value = "getbestseller", method = RequestMethod.GET)
    public List<Product> getBestSeller() {
        return productServices.getBestSeller();
    }

    @RequestMapping(value = "getproductsale", method = RequestMethod.GET)
    public List<Product> getProductSale() {
        return productServices.getProductSale();
    }

    @RequestMapping(value = "getproductsbytype", method = RequestMethod.GET)
    public List<Product> getProductsByType(@RequestParam int id) {
        return productServices.getProductsByType(id);
    }

    @RequestMapping(value = "getallproducttype", method = RequestMethod.GET)
    public List<ProductType> getAllProductType() {
        return productServices.getAllProductType();
    }

    @RequestMapping(value = "getproductbyrange", method = RequestMethod.GET)
    public List<Product> getProductByRanfe(@RequestParam int low, @RequestParam int high) {
        return productServices.getProductByRange(low, high);
    }
}
