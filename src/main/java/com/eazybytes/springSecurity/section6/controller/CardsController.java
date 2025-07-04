package com.eazybytes.springSecurity.section6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getCards(){
        return "Here are the card details from DB";
    }
 
}
