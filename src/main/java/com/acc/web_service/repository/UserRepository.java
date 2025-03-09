package com.acc.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.web_service.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}