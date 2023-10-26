package edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.patient;


import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.address.AddressResponse;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record PatientResponse(

        Integer patientId,

        String fistName,

        String lastName,

        String phoneNumber,

        String email,

        LocalDate dob,

        AddressResponse primaryAddress
) {

}
