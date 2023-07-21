package com.boa.jwt.repositories;


import com.boa.jwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;





public interface UserRepository extends JpaRepository<User,String>{

}
