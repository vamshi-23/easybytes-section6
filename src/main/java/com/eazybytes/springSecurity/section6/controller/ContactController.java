package com.eazybytes.springSecurity.section6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String getContactDetails(){
        return "Here are the contact details from DB";
    }
 
}
