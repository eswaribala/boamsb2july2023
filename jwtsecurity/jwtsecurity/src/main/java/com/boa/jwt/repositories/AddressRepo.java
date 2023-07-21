package com.boa.jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.jwt.models.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

}
