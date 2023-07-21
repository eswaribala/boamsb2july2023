package com.boa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(long empId);
}
