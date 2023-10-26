package com.example.adsdentalsurgeryappointmentwebapi.repository;

import com.example.adsdentalsurgeryappointmentwebapi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
