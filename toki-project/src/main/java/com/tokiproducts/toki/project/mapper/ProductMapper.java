package com.tokiproducts.toki.project.mapper;
import com.tokiproducts.toki.project.dto.ProductDto;
import com.tokiproducts.toki.project.entity.Product;

public class ProductMapper {

    public static ProductDto mapToProductDto(Product product) {

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());

        return productDto;
    }

    public static Product mapToProduct(ProductDto productDto) {

        Product product = new Product();
        product.setProductId(productDto.getId());
        product.setProductName(productDto.getProductName());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());

        return product;

    }
}
