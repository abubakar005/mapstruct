package com.org.example.mapstruct.resource;

import com.org.example.mapstruct.dto.CustomerDto;
import com.org.example.mapstruct.model.Customer;
import com.org.example.mapstruct.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MyController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/test")
    public Customer getModel(@RequestBody CustomerDto dto) {
        return customerService.getCustomerFromDto(dto);
    }
}
