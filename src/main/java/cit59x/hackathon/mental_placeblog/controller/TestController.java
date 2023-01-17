package cit59x.hackathon.mental_placeblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * Initial test on localhost to make sure the app is working.
     * Test passed: went to "localhost:8080/test" in browser and saw "Test Page".
     *
     * @return
     */
    @RequestMapping("/test")
    public String Test() {
        return "test_page";
    }
}
