package com.coriaedu.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    UserValidationService service = new UserValidationService();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginPost(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("password", password);

        if (!service.isUserValid(name, password)) {
            modelMap.addAttribute("errorMessage", "Invalid Credentials!");
            return "login";
        }

        return "welcome";
    }
}
