package com.madroid.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //    @RequestMapping("login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//        logger.debug("Request param ! " + name);
//        model.put("name", name);
//        return "login";
//    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {

        if (authenticationService.authenticate(name, password)) {
            //Authentication
            //name - mad
            //pass - max
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "welcome";
        }
        modelMap.put("errorMessage", "Bad username or password");
        return "login";
    }

}
