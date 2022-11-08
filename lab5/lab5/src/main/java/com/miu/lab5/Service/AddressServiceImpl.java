package com.miu.lab5.Service;

import com.miu.lab5.Entity.Address;
import com.miu.lab5.Middleware.Annotation.ExecuteGet;
import com.miu.lab5.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService{


    @Autowired
    private AddressRepository addressRepository;
    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddress(Long Id) {
        return addressRepository.findById(Id).get();
    }

    @Override
    public void deleteAddress(Long Id) {
        addressRepository.deleteById(Id);
    }

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.save(address);
    }
}
