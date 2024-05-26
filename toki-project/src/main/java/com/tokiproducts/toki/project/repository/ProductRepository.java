package com.tokiproducts.toki.project.repository;

import com.tokiproducts.toki.project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
