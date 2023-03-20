package com.zaga.employeemangement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zaga.employeemangement.entity.EmployeeInfo;

@Service
public interface EmployeeInfoService {

    public List<EmployeeInfo> getemployeeInfo(String employeeId);

    public EmployeeInfo create(EmployeeInfo employeeInfo);

}
