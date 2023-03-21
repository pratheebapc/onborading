package com.zaga.employeemangement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.employeemangement.entity.EmployeeInfo;
import com.zaga.employeemangement.repository.EmployeeInfoRepo;
import com.zaga.employeemangement.service.EmployeeInfoService;

@RestController
@RequestMapping("/zagahrms")
public class EmployeeInfoController {

    @Autowired
    EmployeeInfoRepo employeeInfoRepo;

    @Autowired
    EmployeeInfoService employeeInfoService;

    @PostMapping
    public ResponseEntity<EmployeeInfo> createEmployee(EmployeeInfo employeeInfo) {
        try {
            EmployeeInfo info = employeeInfoService.create(employeeInfo);

            return new ResponseEntity<>(info, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @GetMapping
    public List<EmployeeInfo> getallEmployeeInfo(@RequestParam("employeeId") String employeeId) {
        return employeeInfoService.getemployeeInfo(employeeId);

    }

}
