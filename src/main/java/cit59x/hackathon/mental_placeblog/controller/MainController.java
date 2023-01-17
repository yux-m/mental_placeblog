package cit59x.hackathon.mental_placeblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
@Slf4j
public class MainController {
    @RequestMapping("/survey")
    public String directToSurvey(Model model) {
        //TODO:return "survey";
        return "test_page";
    }

    /**
     * Direct to help page, with contact info provided.
     *
     * @return
     */
    @RequestMapping("/help")
    public String directToHelp() {
        //TODO:return "survey";
        return "help";
    }
}
