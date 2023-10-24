package edu.miu.cs489.lab10.surgery.service.impl;

import edu.miu.cs489.lab10.surgery.dto.address.AddressResponse;
import edu.miu.cs489.lab10.surgery.model.Address;
import edu.miu.cs489.lab10.surgery.repository.AddressRepository;
import edu.miu.cs489.lab10.surgery.dto.address.AddressRequest;
import edu.miu.cs489.lab10.surgery.exception.AddressNotFoundException;
import edu.miu.cs489.lab10.surgery.service.AddressService;

import java.util.List;
import java.util.stream.Collectors;

public class AddressServiceImpl implements AddressService {


    private AddressRepository addressRepository;

//    public AddressServiceImp(AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }

    @Override
    public List<AddressResponse> getAllAddresses() {
        //originally get all address as list of address
        //return as list of address response
        //map from each originally object to address response

        return addressRepository.findAll()
                .stream()
                .map(a -> new AddressResponse(
                        a.getAddressId(),
                        a.getStreet(),
                        a.getCity(),
                        a.getState(),
                        a.getZipCode()
                )).collect(Collectors.toList());
    }

    @Override
    public AddressResponse addNewAddress(AddressRequest newAddress) {
        // return as AddressResponse
        //input as AddressRequest
        //originally return as Address Object

        //There are 2 step conversion
        // - from Requst to Entiry
        // - from Entity to Response
        Address address = new Address(
                newAddress.street(),
                newAddress.city(),
                newAddress.state(),
                newAddress.zipCode()
        );

        var addNewAddress = addressRepository.save(address);

        AddressResponse addressResponse = new AddressResponse(
                addNewAddress.getAddressId(),
                addNewAddress.getStreet(),
                addNewAddress.getCity(),
                addNewAddress.getState(),
                addNewAddress.getZipCode()
        );

        return addressResponse;
    }


    @Override
    public AddressResponse getAddressById(Integer addressId) throws AddressNotFoundException {

        var address = addressRepository.findById(addressId)
                .orElseThrow(() -> new AddressNotFoundException(
                        String.format("Error: Address with Id, %d, is not found", addressId)));

        AddressResponse addressResponse = new AddressResponse(
                address.getAddressId(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getZipCode()
        );

        return addressResponse;
    }

    @Override
    public AddressResponse updateAddress(AddressRequest addressRequest, int addressId) throws AddressNotFoundException{

        var address = addressRepository.findById(addressId)
                .orElseThrow(() -> new AddressNotFoundException(
                        String.format("Error: Address with Id, %d, is not found", addressId)));

        address.setStreet(addressRequest.street());
        address.setCity(addressRequest.city());
        address.setState(addressRequest.state());
        address.setZipCode(addressRequest.zipCode());

        var addNewAddress = addressRepository.save(address);

        System.out.println(address.getStreet());

        AddressResponse addressResponse = new AddressResponse(
                addNewAddress.getAddressId(),
                addNewAddress.getStreet(),
                addNewAddress.getCity(),
                addNewAddress.getState(),
                addNewAddress.getZipCode()
        );

        return addressResponse;
    }

    @Override
    public void deleteAddressById(int addressId) throws AddressNotFoundException {
        var address = addressRepository.findById(addressId)
                .orElseThrow(() -> new AddressNotFoundException(
                        String.format("Error: Address with Id, %d, is not found", addressId)));

        addressRepository.deleteById(addressId);
    }
}
