package edu.miu.cs489.lab7.adssurgerydentalwebapicli.service;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();
    Dentist addNewDentist(Dentist newDentist);

    Dentist getDentistId(Integer dentistId);

    Dentist updateDentist(Dentist editedDentist);

    void deleteDentistById(Integer dentistId);

//    List<Dentist> getDentistByNameStart(String starFirstName);
}
