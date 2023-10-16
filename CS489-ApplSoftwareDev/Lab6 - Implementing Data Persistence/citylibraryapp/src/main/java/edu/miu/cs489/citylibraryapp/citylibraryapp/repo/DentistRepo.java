package edu.miu.cs489.citylibraryapp.citylibraryapp.repo;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DentistRepo extends JpaRepository<Dentist, Long> {
List<Dentist>findBySpecialization(String specialization);
}
