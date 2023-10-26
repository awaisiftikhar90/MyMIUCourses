package com.example.adsdentalsurgeryappointmentwebapi.service;

import com.example.adsdentalsurgeryappointmentwebapi.dto.address.AddressRequest;
import com.example.adsdentalsurgeryappointmentwebapi.dto.address.AddressResponse;
import com.example.adsdentalsurgeryappointmentwebapi.exception.AddressNotFoundException;
import com.example.adsdentalsurgeryappointmentwebapi.model.Address;

import java.util.List;

public interface AddressService {

    List<AddressResponse> getAllAddresses();

    AddressResponse addNewAddress(AddressRequest newAddress);

    AddressResponse getAddressById(Integer addressId) throws AddressNotFoundException;

    AddressResponse updateAddress(AddressRequest addressRequest, int addressId) throws AddressNotFoundException;

    void deleteAddressById(int addressId) throws AddressNotFoundException;


}
