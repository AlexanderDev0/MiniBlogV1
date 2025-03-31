package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.request.AuthRequest;
import com.descomplica.FrameBlog.response.AuthResponse;
import com.descomplica.FrameBlog.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {


    private final AuthenticationManager authenticationManager;


    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationManager authenticationManager, AuthenticationService authenticationService) {
        this.authenticationManager = authenticationManager;
        this.authenticationService = authenticationService;
    }

    @PostMapping(path="/login")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public AuthResponse login(@RequestBody final AuthRequest auth) {

        UsernamePasswordAuthenticationToken userAuthenticationToken = new UsernamePasswordAuthenticationToken(auth.getUsername(), auth.getPassword());

        authenticationManager.authenticate(userAuthenticationToken);

        return new AuthResponse(authenticationService.getToken(auth));
    }
}