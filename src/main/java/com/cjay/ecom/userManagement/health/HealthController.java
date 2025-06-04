package com.cjay.ecom.userManagement.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="cjayecom/v1/user")
public class HealthController {
    
    @GetMapping("/healthz")
    public String healthCheck() {
        return "OK";
    }
    
}
