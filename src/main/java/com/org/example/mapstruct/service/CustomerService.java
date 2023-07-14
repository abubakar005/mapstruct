package com.org.example.mapstruct.service;

import com.org.example.mapstruct.dto.CustomerDto;
import com.org.example.mapstruct.mapper.CustomerMapper;
import com.org.example.mapstruct.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer getCustomerFromDto(CustomerDto customerDto) {
        return customerMapper.customerDtoToCustomer(customerDto);
    }
}
