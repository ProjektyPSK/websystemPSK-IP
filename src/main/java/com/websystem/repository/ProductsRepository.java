package com.websystem.repository;

import com.websystem.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    void deleteByIdProduct(Long id);
    void deleteByNameProductAndIdProduct(String name, Long id);
}
