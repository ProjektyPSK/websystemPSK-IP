package com.websystem.services;

import com.websystem.entity.Address;
import com.websystem.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public Address validateAddress(Address address) {
        return addressRepository.findById(address.getIdAddress().longValue()).get();
    }
}
