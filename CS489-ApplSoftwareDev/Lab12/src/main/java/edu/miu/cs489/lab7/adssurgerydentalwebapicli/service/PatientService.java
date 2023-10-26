package edu.miu.cs489.lab7.adssurgerydentalwebapicli.service;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.patient.PatientResponse;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.exception.PatientNotFoundException;

import java.util.List;

public interface PatientService {

    List<PatientResponse> getAllPatients();

    PatientResponse addNewPatient(PatientRequest newPatient);

    PatientResponse getPatientById(int patientId) throws PatientNotFoundException;

    PatientResponse updatePatientById(PatientRequest patientRequest, int patientId) throws PatientNotFoundException;

    void deletePatientById(int patientId) throws PatientNotFoundException;
}
