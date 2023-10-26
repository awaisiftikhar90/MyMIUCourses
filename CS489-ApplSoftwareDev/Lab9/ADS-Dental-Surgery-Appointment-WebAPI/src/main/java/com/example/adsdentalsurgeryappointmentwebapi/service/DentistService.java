package com.example.adsdentalsurgeryappointmentwebapi.service;

import com.example.adsdentalsurgeryappointmentwebapi.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);
}
