package com.kazim.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazim.datajpa.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
