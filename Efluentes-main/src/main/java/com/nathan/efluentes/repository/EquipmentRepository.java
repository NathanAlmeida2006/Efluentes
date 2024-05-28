package com.nathan.efluentes.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.nathan.efluentes.entity.User;

@Repository 
public interface EquipmentRepository extends JpaRepository<User, Long> { 
 
} 
