package com.org.example.mapstruct.mapper;

import com.org.example.mapstruct.dto.CustomerDto;
import com.org.example.mapstruct.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
