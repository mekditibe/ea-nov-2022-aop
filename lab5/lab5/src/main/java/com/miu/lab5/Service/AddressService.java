package com.miu.lab5.Service;

import com.miu.lab5.Entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddress();
    Address getAddress(Long Id);
    void deleteAddress(Long Id);
    void saveAddress(Address address);
    void updateAddress(Address address);
}
