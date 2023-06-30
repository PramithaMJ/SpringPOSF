package com.springbootacademy.springbatch10pos.controller;

import com.springbootacademy.springbatch10pos.dto.CustomerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
/*@ResponseBody  // convert return "saved"(JAVA), into JSON object
@Controller*/
@RequestMapping("api/v1/customer")
@CrossOrigin // get request of all localhost
public class CustomerController {

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println("customer "+ customerDTO);
        return "saved";
    }
}
