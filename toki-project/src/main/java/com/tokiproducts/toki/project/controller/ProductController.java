package com.tokiproducts.toki.project.controller;

import com.tokiproducts.toki.project.dto.ProductDto;
import com.tokiproducts.toki.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping()
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ProductDto savedEmployee = productService.createProduct(productDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long employeeId) {
        ProductDto productDto = productService.getProductById(employeeId);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping()
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        List<ProductDto> employees = productService.getAllProduct();
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") Long employeeId, @RequestBody ProductDto productDto) {
        ProductDto updatedProduct = productService.updateProduct(employeeId, productDto);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long employeeId) {
        productService.deleteProduct(employeeId);

        return ResponseEntity.ok("Product deleted successfully!.");
    }
}
