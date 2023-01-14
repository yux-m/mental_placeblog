package cit59x.hackathon.mental_placeblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
        return "Test Page.";
    }
}
