package com.coriaedu.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

    public boolean isUserValid(String username, String password) {
        return ("eduardo".equals(username) && "dummy".equals(password));
    }

}
