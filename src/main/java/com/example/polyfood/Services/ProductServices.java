package com.example.polyfood.Services;

import com.example.polyfood.Models.Product;
import com.example.polyfood.Models.ProductDetail;
import com.example.polyfood.Models.ProductType;
import com.example.polyfood.Repositories.ProductDetailRepository;
import com.example.polyfood.Repositories.ProductRepository;
import com.example.polyfood.Repositories.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class ProductServices implements IProductServices{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            return product.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại id sản phẩm");
    }

    @Override
    public String getTypeOfProductByProductId(int id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            Optional<ProductType> productType = productTypeRepository.findById(product.get().getProductTypeId());
            if(productType.isPresent()) {
                return productType.get().getNameProductType();
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại id sản phẩm");
    }

    @Override
    public List<String> getProductDetailByProductId(int id) {
        List<ProductDetail> productDetails = productDetailRepository.findAll();
        List<String> details = new ArrayList<>();
        for(ProductDetail productDetail: productDetails) {
            if(productDetail.getProductId() == id) {
                details.add(productDetail.getDetail());
            }
        }
        return details;
    }

    @Override
    public List<Product> getProductsOrderByView() {
        List<Product> products = productRepository.findAll();
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Integer.compare(product2.getNumberOfViews(), product1.getNumberOfViews());
            }
        });
        return products;
    }

    @Override
    public List<Product> getBestSeller() {
        List<Product> products = productRepository.findAll();
        products.sort(Comparator.comparing(Product::getQuantitySold).reversed());
        return products;
    }

    @Override
    public List<Product> getProductSale() {
        List<Product> products = productRepository.findAll();
        products.removeIf(product -> product.getDiscount() == 0);
        return products;
    }

    @Override
    public List<Product> getProductsByType(int id) {
        List<Product> products = productRepository.findAll();
        List<Product> productsOfType = new ArrayList<>();
        for(Product product: products) {
            if(product.getProductTypeId() == id) {
                productsOfType.add(product);
            }
        }
        return productsOfType;
    }

    @Override
    public List<ProductType> getAllProductType() {return productTypeRepository.findAll();}

    @Override
    public List<Product> getProductByRange(int low, int high) {
        if(low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        List<Product> products = productRepository.findAll();
        List<Product> productsToRemove = new ArrayList<>();
        for(Product product: products) {
            double discountedPrice = product.getPrice() - (product.getPrice() * product.getDiscount())/100;
            if(discountedPrice < low || discountedPrice > high) {
                productsToRemove.add(product);
            }
        }
        products.removeAll(productsToRemove);
        products.sort(Comparator.comparing(Product::getPrice));
        return products;
    }
}
