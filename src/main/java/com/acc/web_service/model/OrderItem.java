package com.acc.web_service.model;

import java.io.Serializable;

import com.acc.web_service.model.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private OrderItemPK id;

  private Integer quantity;
  private Double price;

  public OrderItem(Order order, Product product, Integer quantity, Double price) {
    super();
    id.setOrder(order);
    id.setProduct(product);
    this.quantity = quantity;
    this.price = price;
  }

}
