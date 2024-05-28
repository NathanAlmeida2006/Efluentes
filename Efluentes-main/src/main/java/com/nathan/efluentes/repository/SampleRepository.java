package com.nathan.efluentes.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.nathan.efluentes.entity.Sample;

@Repository 
public interface SampleRepository extends JpaRepository<Sample, Long> { 
 
} 
