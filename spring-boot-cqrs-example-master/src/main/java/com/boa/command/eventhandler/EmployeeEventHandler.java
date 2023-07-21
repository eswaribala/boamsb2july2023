package com.boa.command.eventhandler;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.command.event.EmployeeCreatedEvent;
import com.boa.entity.Employee;
import com.boa.repository.EmployeeRepository;

@Component
public class EmployeeEventHandler {

    @Autowired
    private EmployeeRepository employeeRepository;

    @EventHandler
    public void employeCretedEvent(EmployeeCreatedEvent employeeCreatedEvent){
        Employee emp = new Employee();
        BeanUtils.copyProperties(employeeCreatedEvent, emp);
        employeeRepository.save(emp);
    }
}
