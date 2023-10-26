package edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.address;

public record AddressResponse (
        Integer addressId,
        String street,
        String city,
        String state,
        String zipCode){
}
