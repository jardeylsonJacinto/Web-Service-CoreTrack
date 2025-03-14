package com.acc.web_service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  private String phone;
  private String password;

  @JsonIgnore
  @OneToMany(mappedBy = "client")
  private List<Order> orders = new ArrayList<>();

  public User(Long id, String name, String email, String phone, String password) {
    super();
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.password = password;
  }

  public List<Order> getOrders() {
    return orders;
  }
}
