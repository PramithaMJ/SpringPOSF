package com.springbootacademy.springbatch10pos.service;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;

public interface CustomerService { //abstraction
    public String saveCustomer(CustomerDTO customerDTO);
}
