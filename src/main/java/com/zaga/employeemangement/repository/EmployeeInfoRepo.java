package com.zaga.employeemangement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zaga.employeemangement.entity.EmployeeInfo;

public interface EmployeeInfoRepo extends MongoRepository<EmployeeInfo, String> {

}
