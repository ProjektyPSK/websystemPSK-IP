package com.websystem.repository;

import com.websystem.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    void deleteByIdProduct(Long id);
    void deleteByNameProductAndIdProduct(String name, Long id);
}
