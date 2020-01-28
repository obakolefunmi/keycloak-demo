package com.etz.keycloaklearn.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @PreAuthorize("hasRole('admin')")
    @GetMapping(value = "/test")
    public String getMethodName() {
        return "You Hack well";
    }

}