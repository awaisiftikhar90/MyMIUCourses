package edu.miu.cs489.citylibraryapp.citylibraryapp.service;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Dentist;

import java.util.List;

public interface DentistService {
    void addDentist(Dentist dentist);
    List<Dentist> findBySpecialization(String specialization);
}
