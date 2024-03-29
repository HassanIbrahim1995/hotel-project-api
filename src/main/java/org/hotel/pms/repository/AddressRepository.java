package org.hotel.pms.repository;

import org.hotel.pms.model.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Page<Address> findAllByOrderByZipCodeAsc(Pageable pageable);
}
