package com.zensar.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.login.entity.User;

public interface OlxLoginRepository extends JpaRepository<User, Integer> {

}
