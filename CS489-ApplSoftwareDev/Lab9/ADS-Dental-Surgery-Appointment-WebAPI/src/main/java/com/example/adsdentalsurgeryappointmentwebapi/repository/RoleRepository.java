package com.example.adsdentalsurgeryappointmentwebapi.repository;

import com.example.adsdentalsurgeryappointmentwebapi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Optional<Role> findRoleByName(String name);
}
