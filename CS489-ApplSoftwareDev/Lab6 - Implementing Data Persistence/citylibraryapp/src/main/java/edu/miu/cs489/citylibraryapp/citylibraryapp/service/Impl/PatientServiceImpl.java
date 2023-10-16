package edu.miu.cs489.citylibraryapp.citylibraryapp.service.Impl;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Patient;
import edu.miu.cs489.citylibraryapp.citylibraryapp.repo.PatientRepo;
import edu.miu.cs489.citylibraryapp.citylibraryapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl  implements PatientService {
    private final PatientRepo patientRepo;
    @Autowired
    PatientServiceImpl(PatientRepo patientRepo){
        this.patientRepo = patientRepo;
    }
    @Override
    public void addPatient(Patient patient) {

    }

    @Override
    public Patient findByEmail(String email) {
        return null;
    }
}
