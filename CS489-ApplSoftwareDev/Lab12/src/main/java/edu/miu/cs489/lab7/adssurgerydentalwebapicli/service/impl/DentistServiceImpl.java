package edu.miu.cs489.lab7.adssurgerydentalwebapicli.service.impl;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.model.Dentist;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.repository.DentistRepository;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.service.DentistService;

import java.util.List;

public class DentistServiceImpl implements DentistService {


    //    @Autowired
    private DentistRepository dentistRepository;

    //    @Autowired
    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist addNewDentist(Dentist newPublisher) {
        return dentistRepository.save(newPublisher);
    }

    @Override
    public Dentist getDentistId(Integer publisherId) {
        return dentistRepository.findById(publisherId)
                .orElse(null);
    }

    @Override
    public Dentist updateDentist(Dentist editedPublished) {
        return dentistRepository.save(editedPublished);
    }

    @Override
    public void deleteDentistById(Integer publisherId) {
        dentistRepository.deleteById(publisherId);
    }

//    @Override
//    public List<Dentist> getDentistByNameStart(String starFirstName) {
//        return dentistRepository.getDentistByNameStart(starFirstName);
//    }
}
