package com.example.ordercrud.repository;

import com.example.ordercrud.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
