package com.acc.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.web_service.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
