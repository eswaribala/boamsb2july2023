package com.boa.jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.jwt.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
