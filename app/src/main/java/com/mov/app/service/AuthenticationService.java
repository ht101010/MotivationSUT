package com.mov.app.service;

import com.mov.app.model.LoginModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    public void login(LoginModel request);
}
