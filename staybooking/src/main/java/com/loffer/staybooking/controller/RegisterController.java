package com.loffer.staybooking.controller;

import org.springframework.web.bind.annotation.RestController;
import com.loffer.staybooking.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import com.loffer.staybooking.model.User;
import com.loffer.staybooking.model.UserRole;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RegisterController {
    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register/guest")
    public void addGuest(@RequestBody User user) {
        registerService.add(user, UserRole.ROLE_GUEST);
    }

    @PostMapping("/register/host")
    public void addHost(@RequestBody User user) {
        registerService.add(user, UserRole.ROLE_HOST);
    }
}


