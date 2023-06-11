package com.ram.sample.EmployeeCurdoperation.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ram.sample.EmployeeCurdoperation.Entity.Employee;
import com.ram.sample.EmployeeCurdoperation.Repository.EmployeeRepository;

public class Conroller {

@Component
public class Employeecontroller {

	EmployeeRepository repository;

	@PostMapping("/saveemployee")
	public Employee save(@RequestBody Employee employ) {
		return repository.save(employ);

	}

	@PutMapping("/update")
	public Employee update(@RequestBody Employee employ) {
		return repository.save(employ);

	}

	@DeleteMapping("/delete")
	public String delete(@RequestParam Integer empid) {
		repository.deleteById(empid);
		return "delete sucessfully";

	}

	@GetMapping("/Getmployee")
	public List<Employee> getAllemps() {
		return repository.findAll();

	}
}


}
