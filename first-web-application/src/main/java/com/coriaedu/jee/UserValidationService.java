package com.coriaedu.jee;

public class UserValidationService {

    public boolean isUserValid(String username, String password) {
        return ("eduardo".equals(username) && "dummy".equals(password));
    }

}