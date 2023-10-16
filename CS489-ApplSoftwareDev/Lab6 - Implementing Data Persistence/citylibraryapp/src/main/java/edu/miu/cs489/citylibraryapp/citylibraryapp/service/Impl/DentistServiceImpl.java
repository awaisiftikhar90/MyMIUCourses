package edu.miu.cs489.citylibraryapp.citylibraryapp.service.Impl;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Dentist;
import edu.miu.cs489.citylibraryapp.citylibraryapp.repo.DentistRepo;
import edu.miu.cs489.citylibraryapp.citylibraryapp.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DentistServiceImpl implements DentistService {
private final DentistRepo dentistRepo;
@Autowired
DentistServiceImpl(DentistRepo dentistRepo){this.dentistRepo = dentistRepo;}
    @Override
    public void addDentist(Dentist dentist) {
         dentistRepo.save(dentist);

    }

    @Override
    public List<Dentist> findBySpecialization(String specialization) {
         return dentistRepo.findBySpecialization(specialization);
    }
}
