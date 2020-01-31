package com.etz.keycloaklearn.controllers;

import javax.servlet.http.HttpServletRequest;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
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

    @PreAuthorize("hasAuthority('ROLE_user')")
    @GetMapping(value = "/test")
    public String getMethodName(HttpServletRequest request) {
        String userId = request.getUserPrincipal().getName();
        KeycloakAuthenticationToken principal = (KeycloakAuthenticationToken) request.getUserPrincipal();
        System.out.println("SHALOM1: " + principal.getAccount().getKeycloakSecurityContext().getToken().getSubject());
        return "You Hack well This is your Id : " + userId;
    }

}