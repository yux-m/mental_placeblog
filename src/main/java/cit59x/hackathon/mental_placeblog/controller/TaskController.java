package cit59x.hackathon.mental_placeblog.controller;

import cit59x.hackathon.mental_placeblog.service.TaskSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class TaskController {

    private final int THRESHOLD_1 = 20;
    private final int THRESHOLD_2 = 40;
    private final int THRESHOLD_3 = 60;
    private final int THRESHOLD_4 = 80;
    @Autowired
    private TaskSevice taskSevice;

    /**
     * Direct to task page according to score.
     *
     * @return page to be directed to
     */
    @RequestMapping("/task")
    public String directToTask(Model model, int score) {
        //TODO: change task names
        if (score < 0 || score > 100) return "error";
        else if (score <= THRESHOLD_1) return quote(model);
        else if (score <= THRESHOLD_2) return "task2";
        else if (score <= THRESHOLD_3) return "task3";
        else if (score <= THRESHOLD_4) return "task4";
        else return "task5";
    }

    /**
     * Get quote from database and pass to frontend for view.
     *
     * @param model
     * @return
     */
    @RequestMapping("/task/quote")
    public String quote(Model model) {
        String quote = taskSevice.getQuote();
        model.addAttribute("quote", quote);
        return "task_quote";
    }


}
