package com.springbootacademy.springbatch10pos.controller;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;
import com.springbootacademy.springbatch10pos.service.CustomerService;
import com.springbootacademy.springbatch10pos.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
/*@ResponseBody  // convert return "saved"(JAVA), into JSON object
@Controller*/
@RequestMapping("api/v1/customer")
@CrossOrigin // get request of all localhost
public class CustomerController {

    @Autowired
    private CustomerServiceIMPL customerServiceIMPL;
    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

        customerServiceIMPL.saveCustomer(customerDTO); // call one class to another class method using object

       // System.out.println("customer "+ customerDTO);
        return "saved";
    }
}
