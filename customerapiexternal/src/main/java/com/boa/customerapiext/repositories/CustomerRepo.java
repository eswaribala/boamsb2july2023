package com.boa.customerapiext.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.customerapiext.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
