package com.wpp.spike.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wpp.spike.model.Customer;
import com.wpp.spike.service.CustomerService;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
   private final Logger logger = LoggerFactory.getLogger(getClass());
   
   @Autowired
   private CustomerService service;
   
   @ResponseStatus(HttpStatus.CREATED)
   @RequestMapping(method=RequestMethod.POST)
   public void createCustomer(@RequestBody Customer customer) {
      service.insert(customer);
   }
   
   
}
