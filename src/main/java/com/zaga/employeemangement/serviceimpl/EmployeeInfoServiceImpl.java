package com.zaga.employeemangement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.employeemangement.entity.EmployeeInfo;
import com.zaga.employeemangement.repository.EmployeeInfoRepo;
import com.zaga.employeemangement.service.EmployeeInfoService;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

    @Autowired
    EmployeeInfoRepo employeeInfoRepo;

    @Override
    public List<EmployeeInfo> getemployeeInfo(String employeeId) {
        return employeeInfoRepo.findAll();
    }

    @Override
    public EmployeeInfo create(EmployeeInfo employeeInfo) {

        return employeeInfoRepo.save(employeeInfo);
    }

}
