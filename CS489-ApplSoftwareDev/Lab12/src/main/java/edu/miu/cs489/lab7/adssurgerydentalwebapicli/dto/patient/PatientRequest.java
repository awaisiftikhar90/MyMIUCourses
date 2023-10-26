package edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.patient;


import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.address.AddressRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PatientRequest(

        String fistName,

        String lastName,

        String phoneNumber,

        @NotBlank(message = "Patient email is required and cannot be null or empty string or blank spaces")
        String email,

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate dob,

        @Valid AddressRequest primaryAddress
) {
}
