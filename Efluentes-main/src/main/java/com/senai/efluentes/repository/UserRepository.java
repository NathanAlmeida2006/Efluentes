package com.senai.efluentes.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.senai.efluentes.entity.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long> { 
 
} 
