package cit59x.hackathon.mental_placeblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * Direct to register page.
     *
     * @return
     */
    @RequestMapping("/register")
    public String toRegisterPage() {
        //
        return null;
    }

    /**
     * Create new user with frontend inputs.
     *
     * @return
     */
    @RequestMapping("/register/process")
    public String register() {
        //
        return null;
    }

    /**
     * Direct to login page.
     *
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        //
        return null;
    }

    /**
     * Try to sign user in with frontend inputs.
     * If success, add user data to model for frontend use.
     *
     * @return
     */
    @RequestMapping("/login/process")
    public String login() {
        //
        return null;
    }

    @RequestMapping("/update_password")
    public String toUpdatePassword() {
        //
        return null;
    }

    //Other features including update password/info are to be decided & added
}
