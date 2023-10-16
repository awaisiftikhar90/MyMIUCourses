package edu.miu.cs489.citylibraryapp.citylibraryapp.repo;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address , Long> {
}
