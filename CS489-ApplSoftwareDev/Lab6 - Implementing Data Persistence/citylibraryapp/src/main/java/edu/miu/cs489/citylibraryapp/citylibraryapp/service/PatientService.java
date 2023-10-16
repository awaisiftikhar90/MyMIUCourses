package edu.miu.cs489.citylibraryapp.citylibraryapp.service;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Patient;

public interface PatientService {

    void addPatient(Patient patient);
    Patient findByEmail(String email);
}
