package edu.miu.cs489.citylibraryapp.citylibraryapp.repo;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address , Long> {
}
