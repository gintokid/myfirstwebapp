package com.madroid.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return username.equalsIgnoreCase("mad") && password.equals("max");
    }
}
