package com.eazybytes.springSecurity.section6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalance(){
        return "Here is the account balance from DB";
    }
 
}
