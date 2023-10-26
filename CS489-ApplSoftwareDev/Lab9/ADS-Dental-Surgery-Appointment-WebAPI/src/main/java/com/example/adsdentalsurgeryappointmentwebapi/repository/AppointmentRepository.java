package com.example.adsdentalsurgeryappointmentwebapi.repository;

import com.example.adsdentalsurgeryappointmentwebapi.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
