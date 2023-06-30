package com.springbootacademy.springbatch10pos.controller;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin // get request of all localhost
public class CustomerController {

    @PostMapping
    public String saveCustomer(CustomerDTO customerDTO) {
        System.out.println("customer "+ customerDTO);
        return "saved";
    }
}
