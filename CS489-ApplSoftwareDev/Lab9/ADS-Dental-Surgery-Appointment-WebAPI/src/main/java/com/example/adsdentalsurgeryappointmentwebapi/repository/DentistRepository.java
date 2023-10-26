package com.example.adsdentalsurgeryappointmentwebapi.repository;

import com.example.adsdentalsurgeryappointmentwebapi.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist,Integer> {
}
