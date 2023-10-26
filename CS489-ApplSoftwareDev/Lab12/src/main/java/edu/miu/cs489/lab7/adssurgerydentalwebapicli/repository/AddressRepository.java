package edu.miu.cs489.lab7.adssurgerydentalwebapicli.repository;

import edu.miu.cs489.lab7.adssurgerydentalwebapicli.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address, Integer> {
}
