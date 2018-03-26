package com.moting.boot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moting.boot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
