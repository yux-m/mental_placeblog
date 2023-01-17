package cit59x.hackathon.mental_placeblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
@Slf4j
public class SurveyController {
    @RequestMapping("/questions")
    public String directToSurvey(Model model) {
        //TODO:return "survey";
        return "test_page";
    }
}
