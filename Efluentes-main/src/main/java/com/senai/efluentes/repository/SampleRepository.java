package com.senai.efluentes.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.senai.efluentes.entity.Sample;

@Repository 
public interface SampleRepository extends JpaRepository<Sample, Long> { 
 
} 
