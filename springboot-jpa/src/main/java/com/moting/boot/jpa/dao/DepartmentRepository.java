package com.moting.boot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moting.boot.jpa.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
