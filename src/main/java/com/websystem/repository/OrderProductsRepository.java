package com.websystem.repository;

import com.websystem.entity.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProducts, Long> {
}
