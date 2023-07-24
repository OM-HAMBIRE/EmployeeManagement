package com.assignment.employeemanage.dao;

import org.springframework.stereotype.Repository;

import com.assignment.employeemanage.model.EmployeeManage;


import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EmployeeManageDao extends MongoRepository<EmployeeManage, String> {
}
