package com.springbootacademy.springbatch10pos.service;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;
import com.springbootacademy.springbatch10pos.dto.request.CustomerUpdateDto;

public interface CustomerService { //abstraction
    public String saveCustomer(CustomerDTO customerDTO);


    //fdd
    String updateCustomer(CustomerUpdateDto customerUpdateDto);
}
