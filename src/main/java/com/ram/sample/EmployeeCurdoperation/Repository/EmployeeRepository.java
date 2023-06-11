package com.ram.sample.EmployeeCurdoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.sample.EmployeeCurdoperation.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
