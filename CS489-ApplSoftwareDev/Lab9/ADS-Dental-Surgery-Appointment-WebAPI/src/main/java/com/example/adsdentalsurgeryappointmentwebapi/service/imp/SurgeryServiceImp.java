package com.example.adsdentalsurgeryappointmentwebapi.service.imp;

import com.example.adsdentalsurgeryappointmentwebapi.model.Surgery;
import com.example.adsdentalsurgeryappointmentwebapi.repository.SurgeryRepository;
import com.example.adsdentalsurgeryappointmentwebapi.service.SurgeryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryServiceImp implements SurgeryService {

    private SurgeryRepository surgeryRepository;

    public SurgeryServiceImp(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }


    @Override
    public List<Surgery> getAllSurgeries() {
        return surgeryRepository.findAll();
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        return surgeryRepository.save(newSurgery);
    }
}
