package edu.miu.cs489.lab7.adssurgerydentalwebapicli.service;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.address.AddressRequest;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.dto.address.AddressResponse;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.exception.AddressNotFoundException;
import edu.miu.cs489.lab7.adssurgerydentalwebapicli.model.Address;

import java.util.List;

public interface AddressService {

    List<AddressResponse> getAllAddresses();

    AddressResponse addNewAddress(AddressRequest newAddress);

    AddressResponse getAddressById(Integer addressId) throws AddressNotFoundException;

    AddressResponse updateAddress(AddressRequest addressRequest, int addressId) throws AddressNotFoundException;

    void deleteAddressById(int addressId) throws AddressNotFoundException;
}
