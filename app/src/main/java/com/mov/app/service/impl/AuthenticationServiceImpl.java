package com.mov.app.service.impl;

import com.mov.app.model.LoginModel;
import com.mov.app.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public void login(LoginModel request) {
        System.out.println("user="+request.getUser());
        System.out.println("pass="+request.getPass());
    }
}
