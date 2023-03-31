package app.reddot.service;

import app.reddot.controller.RegistrationRequest;

import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    public String register(RegistrationRequest request) {
        return "works";
    }
}