package com.miu.lab5.Controller;

import com.miu.lab5.Entity.Address;
import com.miu.lab5.Service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/address")
@RestController
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping("/{Id}")
    public Address getAddress(@PathVariable Long Id){
        return addressService.getAddress(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteAddress(@PathVariable Long Id){
        addressService.deleteAddress(Id);
    }

    @PostMapping
    public void  addAddress(@RequestBody Address address){
        addressService.saveAddress(address);
    }

    @PutMapping
    public void updateAddress(@RequestBody Address address){
        addressService.updateAddress(address);
    }

}
