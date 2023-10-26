package com.example.adsdentalsurgeryappointmentwebapi.service;

import com.example.adsdentalsurgeryappointmentwebapi.model.Surgery;

import java.util.List;

public interface SurgeryService {

    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery(Surgery newSurgery);
}
