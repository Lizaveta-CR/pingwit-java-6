package com.pingwit.spring.les_6.house.service;

import com.pingwit.spring.les_6.house.entity.Address;
import com.pingwit.spring.les_6.house.repository.AddressRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {this.addressRepository = addressRepository;}

    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }
}
