package com.ram.sample.EmployeeCurdoperation.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	

@Id	
@Column(name="id")
private int id;

//@Column(name = "employee_name",length = 25)
private String name;
//@Column(name = "Employee_salary" ,length = 8)
private int salary;
@Column(name = "Employee_email" ,length = 20)
private String email;
//@Column(name = "Employee_email" ,length = 30)
private String address;
//@Column(name = "Employee_email" ,length = 10)
private String phoneno;
}