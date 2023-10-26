package com.example.adsdentalsurgeryappointmentwebapi.service;

import com.example.adsdentalsurgeryappointmentwebapi.dto.patient.PatientRequest;
import com.example.adsdentalsurgeryappointmentwebapi.dto.patient.PatientResponse;
import com.example.adsdentalsurgeryappointmentwebapi.exception.PatientNotFoundException;

import java.util.List;

public interface PatientService {

    List<PatientResponse> getAllPatients();

    PatientResponse addNewPatient(PatientRequest newPatient);

    PatientResponse getPatientById(int patientId) throws PatientNotFoundException;

    PatientResponse updatePatientById(PatientRequest patientRequest, int patientId) throws PatientNotFoundException;

    void deletePatientById(int patientId) throws PatientNotFoundException;

//    List<PatientResponse> searchPatient(String searchString);

}
