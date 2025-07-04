package com.eazybytes.springSecurity.section6.controller;

import com.eazybytes.springSecurity.section6.model.Customer;
import com.eazybytes.springSecurity.section6.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){

        try{
            String hashPwd = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashPwd);
            Customer savedCustomer=customerRepository.save(customer);
            if (savedCustomer.getId()>0){
                return ResponseEntity.status(HttpStatus.CREATED).body("User Registered Successfully");
            }else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Registration Failed");
            }

        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An Exception Occurred: "+e.getMessage());
        }
    }
}
