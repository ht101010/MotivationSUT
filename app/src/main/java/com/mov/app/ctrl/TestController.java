package com.mov.app.ctrl;

import com.mov.app.model.LoginModel;
import com.mov.app.service.impl.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AuthenticationServiceImpl authentication;

    @PostMapping("/1")
    public void test1(@RequestBody LoginModel request) {
        authentication.login(request);
    }
}
