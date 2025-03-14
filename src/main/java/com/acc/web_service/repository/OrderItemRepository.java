package com.acc.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.web_service.model.OrderItem;
import com.acc.web_service.model.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}