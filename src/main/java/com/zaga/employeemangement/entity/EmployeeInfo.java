package com.zaga.employeemangement.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "EmployeeInfo")
public class EmployeeInfo {

    public String employeeId;
    public String empName;
    public String role;
    public String jobTitle;
    public String dateOfJoining;
    public String workEmail;
    public String password;
    public String department;
    public boolean billable;
    public String reportingManager;
    public String employeeStatus;
    public Integer experience;

}
