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
@Document(collection = "PersonalInfo")
public class PersonalInfo {

    public String gender;
    public String nationality;
    public String maritalStatus;
    public String language;
    public String dateOfBirth;
    public String bloodGroup;
    public Contact contact;

}
