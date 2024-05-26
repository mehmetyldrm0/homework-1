package com.tokiproducts.toki.project.service;

import com.tokiproducts.toki.project.dto.ProductDto;

import java.util.List;

public interface ProductService {
    public ProductDto createProduct(ProductDto productDto);

    public ProductDto getProductById(Long productId);

    public List<ProductDto> getAllProduct();

    public ProductDto updateProduct(Long productId, ProductDto updatedProduct);

    public void deleteProduct(Long productId);
}
