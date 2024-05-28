package com.senai.efluentes.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.senai.efluentes.entity.Equipment;

@Repository 
public interface EquipmentRepository extends JpaRepository<Equipment, Long> { 
 
} 
