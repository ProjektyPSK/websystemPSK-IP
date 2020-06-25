package com.websystem.repository;

import com.websystem.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

}
