package com.example.adsdentalsurgeryappointmentwebapi.repository;

import com.example.adsdentalsurgeryappointmentwebapi.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery,Integer> {
}
