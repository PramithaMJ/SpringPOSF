package com.springbootacademy.springbatch10pos.service.impl;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;
import com.springbootacademy.springbatch10pos.dto.request.CustomerUpdateDto;
import com.springbootacademy.springbatch10pos.entity.Customer;
import com.springbootacademy.springbatch10pos.repo.CustomerRepo;
import com.springbootacademy.springbatch10pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerSalery(),
                customerDTO.getNic(),
                customerDTO.isActiveStatus()
        );
        customerRepo.save(customer);//Save object to database
        return "saved";
    }

    @Override
    public String updateCustomer(CustomerUpdateDto customerUpdateDto) {
       if(customerRepo.existsById(customerUpdateDto.getCustomerId())){
           System.out.println("found data");
       }else{
          throw new RuntimeException("NO data found in that id");
       }
       return "Saman";
    }


}
