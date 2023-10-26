package com.example.adsdentalsurgeryappointmentwebapi.dto.address;

public record AddressResponse (
        Integer addressId,
        String street,
        String city,
        String state,
        String zipCode){
}
