package cit59x.hackathon.mental_placeblog.controller;

import cit59x.hackathon.mental_placeblog.vo.LoginVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    public String toLoginPage() {
        return "login";
    }

    /**
     * Try to sign user in with frontend inputs.
     * If success, add user data to model for frontend use.
     *
     * @return
     */
    @RequestMapping("/login/process")
    public String login(LoginVO loginVO, HttpServletRequest request, HttpServletResponse response) {
        //
        return null;
    }

}
