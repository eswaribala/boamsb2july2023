package com.boa.query.eventhandler;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.entity.Employee;
import com.boa.query.controller.EmployeeResponse;
import com.boa.query.controller.GetEmployeeQuery;
import com.boa.repository.EmployeeRepository;

import java.util.*;

@Component
public class EmployeeQueryHandler {
    @Autowired
    EmployeeRepository employeeRepository;

    @QueryHandler
    public List<EmployeeResponse> getEmployees(GetEmployeeQuery employeeQuery){

        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        Optional<List<Employee>> employees = Optional.ofNullable(employeeRepository.findAll());

        if(employees.isPresent()){
            for (Employee empObj: employees.get()){
                EmployeeResponse response = new EmployeeResponse();
                BeanUtils.copyProperties(empObj,response);
                employeeResponses.add(response);
            }
        }

        return employeeResponses;
    }
}
