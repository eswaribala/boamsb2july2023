package com.boa.customerapiext.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.customerapiext.models.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

}
