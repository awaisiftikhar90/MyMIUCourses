package edu.miu.cs489.lab7.adssurgerydentalwebapicli.repository;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
