package com.eazybytes.springSecurity.section6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails(){
        return "Here are the loan details from DB";
    }
 
}
