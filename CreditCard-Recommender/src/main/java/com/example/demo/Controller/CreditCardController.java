package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CreditCardController {
    
    @GetMapping("/recommend")
    public String recommendCard(@RequestParam int income){
        if(income<20000) return "Student Card";
        else if (income<50000) return "Cashback ";
        else return "Premium Card";
    }
}
