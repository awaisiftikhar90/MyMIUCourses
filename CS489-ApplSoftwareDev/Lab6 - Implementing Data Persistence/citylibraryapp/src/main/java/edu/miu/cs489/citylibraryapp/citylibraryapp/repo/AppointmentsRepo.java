package edu.miu.cs489.citylibraryapp.citylibraryapp.repo;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentsRepo extends JpaRepository<Appointment , Long> {
    List<Appointment> findByDentistFirstName(String name);
}
